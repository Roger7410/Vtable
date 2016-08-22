package cs652.j.codegen;

import cs652.j.JTran;
import cs652.j.codegen.model.*;
import cs652.j.parser.JBaseVisitor;
import cs652.j.parser.JParser;
import cs652.j.semantics.JClass;

////check later: package in org.antlr.symbols are wrong
//import org.antlr.symbols.MethodSymbol;
//import org.antlr.symbols.Scope;
//import org.antlr.symbols.Symbol;
//import org.antlr.symbols.Type;
//import org.antlr.symbols.Utils;
import cs652.j.semantics.JPrimitiveType;
import org.antlr.symtab.*;
//import org.antlr.symbols.*;


import org.antlr.v4.runtime.ParserRuleContext;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CodeGenerator extends JBaseVisitor<OutputModelObject> {
	public STGroup templates;
	public String fileName;

	public Scope currentScope;

	public JClass currentClass;

	public CodeGenerator(String fileName) {
		this.fileName = fileName;
		templates = new STGroupFile("cs652/j/templates/C.stg");
	}

    public void pushScope(Scope s) {
        currentScope = s;
        System.out.println("entering: "+currentScope.getName()+":"+s);
    }

    public void popScope() {
        System.out.println("leaving: "+currentScope.getName()+":"+currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

	public CFile generate(ParserRuleContext tree) {
		CFile file = (CFile)visit(tree);
		return file;
	}

    @Override
    public OutputModelObject visitFile(JParser.FileContext ctx) {
        pushScope(ctx.scope);
        CFile cFile = new CFile(ctx.getText());
        List<ClassDef> classes = new ArrayList<>();
        List<JParser.ClassDeclarationContext> cDeclarations = ctx.classDeclaration();
//        for (JParser.ClassDeclarationContext cDeclaration : cDeclarations){
//            classes.add((ClassDef) visit(ctx.classDeclaration()));
//        }
        // add
        for(int i=0;i<cDeclarations.size();i++){
            classes.add((ClassDef) visit(ctx.classDeclaration(i)));
        }

        cFile.main = (MainMethod) visitMain(ctx.main());
        cFile.classes = classes;
        return cFile;

    }

//    MainMethod(main,funcName,returnType,args,body) ::= <<
//    <returnType> main(int argc, char *argv[]){
//        <body>
//    }
    @Override
    public OutputModelObject visitMain(JParser.MainContext ctx) {
        MainMethod mMethod = new MainMethod();
        Block mBody = new Block();
        List<JParser.BlockStatementContext> mBlocks = ctx.mainblock().block().blockStatement();
        List<Stat> statments = new ArrayList<>();
        List<VarDef> variables = new ArrayList<>();
        // build body here
        for(int i = 0; i<mBlocks.size();i++){
            if(ctx.mainblock().block().blockStatement(i).statement() != null){
                statments.add((Stat) visit(ctx.mainblock().block().blockStatement(i).statement()));
            }else if(ctx.mainblock().block().blockStatement(i).localVariableDeclaration() != null){
                variables.add((VarDef) visit(ctx.mainblock().block().blockStatement(i).localVariableDeclaration()));
            }
        }
        mBody.instrs = statments;
        mBody.locals = variables;
        mMethod.body = mBody;
        return mMethod;
    }

    @Override
    public OutputModelObject visitClassDeclaration(JParser.ClassDeclarationContext ctx) {
        pushScope(ctx.scope);
        currentClass = (JClass)currentScope;
        ClassDef cDef = new ClassDef(ctx.name.getText());
        //fields
        List<VarDef> cFields = new ArrayList<>();
        List<? extends FieldSymbol> fields = currentClass.getFields();
        VarDef varDef;
        for(FieldSymbol f: fields){
            varDef = new VarDef(f.getName());
            if(f.getType() instanceof JPrimitiveType){
                varDef.type = new PrimitiveTypeSpec(f.getType().getName());
            }else {
                varDef.type = new ObjectTypeSpec(f.getType().getName());
            }
            cFields.add(varDef);
        }

        //vtable
        List<VTable> vTable = new ArrayList<>();
        Set<MethodSymbol> methodSymbols = currentClass.getMethods();
        for (MethodSymbol m : methodSymbols){
            VTable v = new VTable();
            v.className = new ClassName(m.getEnclosingScope().getName());
            v.funcName = new FuncName(m.getName());
            v.slot = m.getSlotNumber();
            vTable.add(v);
        }

        //methods
        List<MethodDef> methods = new ArrayList<>();
        List<JParser.ClassBodyDeclarationContext> cbDeclaration = ctx.classBody().classBodyDeclaration();
        for(int i=0;i<cbDeclaration.size();i++){
            if(ctx.classBody().classBodyDeclaration(i).methodDeclaration() != null){
                methods.add((MethodDef) visit(ctx.classBody().classBodyDeclaration(i).methodDeclaration()));
            }
        }

        Collections.sort(vTable);
        cDef.fields = cFields;
        cDef.methods = methods;
        cDef.vtable = vTable;

        popScope();
        return cDef;
    }

    @Override
    public OutputModelObject visitClassBody(JParser.ClassBodyContext ctx) {
        ClassDef cBody = new ClassDef("");
        List<JParser.ClassBodyDeclarationContext> cbDeclaration = ctx.classBodyDeclaration();
        List<VarDef> fields = new ArrayList<>();
        List<MethodDef> methods = new ArrayList<>();
        for(int i=0;i<cbDeclaration.size();i++){
            if(ctx.classBodyDeclaration(i).fieldDeclaration() != null){
                fields.add((VarDef) visit(ctx.classBodyDeclaration(i).fieldDeclaration()));
            }else if(ctx.classBodyDeclaration(i).methodDeclaration() != null){
                methods.add((MethodDef) visit(ctx.classBodyDeclaration(i).methodDeclaration()));
            }
        }
        cBody.fields = fields;
        cBody.methods= methods;
        return cBody;
    }

//    MethodDef(m,funcName,returnType,args,body) ::= <<
//    <returnType> <funcName> (<args:{arg|<arg>}; separator=", ">){
//        <body>
//    }
//    >>
    @Override
    public OutputModelObject visitMethodDeclaration(JParser.MethodDeclarationContext ctx) {
        pushScope(ctx.scope);
        MethodDef mDef = new MethodDef();
        //funcName
        mDef.funcName = new FuncName(currentClass.getName()+"_"+ctx.IDENTIFIER().getText());

        //return type
        mDef.returnType = (TypeSpec) visit(ctx.jType());

        //args
        List<VarDef> mArgs = new ArrayList<>();
        //+ this
        VarDef varDef = new VarDef("this");
        varDef.type = new ObjectTypeSpec(currentClass.getName());
        mArgs.add(varDef);
        //+ other
        if(ctx.formalParameters().formalParameterList() != null){
            List<JParser.FormalParameterContext> parameters =
                    ctx.formalParameters().formalParameterList().formalParameter();
            for(int i=0; i<parameters.size(); i++){
                mArgs.add((VarDef) visit(ctx.formalParameters().formalParameterList().formalParameter(i)));
            }
        }
        mDef.args = mArgs;

        //body
        Block mBody = new Block();
        mBody = (Block) visit(ctx.methodBody());
        mDef.body = mBody;

        popScope();
        return mDef;
    }

    @Override
    public OutputModelObject visitFormalParameter(JParser.FormalParameterContext ctx) {
        VarDef var = new VarDef(ctx.IDENTIFIER().getText());
        var.type = (TypeSpec) visit(ctx.jType());
        return var;
    }

    @Override
    public OutputModelObject visitMethodBody(JParser.MethodBodyContext ctx) {
        return visit(ctx.block());
    }

    @Override
    public OutputModelObject visitFieldDeclaration(JParser.FieldDeclarationContext ctx) {
        VarDef var = new VarDef(ctx.IDENTIFIER().getText());
        var.type = (TypeSpec) visit(ctx.jType());
        return var;
    }

//    @Override
//    public OutputModelObject visitVariable(JParser.VariableContext ctx) {
//        VarDef var = new VarDef(ctx.IDENTIFIER().getText());
//        var.type = (TypeSpec) visit(ctx.jType());
//        return var;
//    }

    @Override
    public OutputModelObject visitBlock(JParser.BlockContext ctx) {
        pushScope(ctx.scope);

        Block body = new Block();
        List<JParser.BlockStatementContext> bStatements= ctx.blockStatement();
        List<Stat> statments = new ArrayList<>();
        List<VarDef> variables = new ArrayList<>();
        for(JParser.BlockStatementContext sc : bStatements){
            if(sc.localVariableDeclaration()!=null){
                variables.add((VarDef) visit(sc));
            }else if(sc.statement()!=null){
                statments.add((Stat) visit(sc));
            }
        }
        body.instrs= statments;
        body.locals = variables;

        popScope();
        return body;
    }

    //STAT!!!

    @Override
    public OutputModelObject visitAssignStat(JParser.AssignStatContext ctx) {
        AssignStat asStat = new AssignStat();
        asStat.assoc = (Expr)visit(ctx.expression(0));
        asStat.right = (Expr)visit(ctx.expression(1));
        return asStat;
    }

    @Override
    public OutputModelObject visitIfStat(JParser.IfStatContext ctx) {
        IfStat ifStat = new IfStat();
        ifStat.condition = (Expr) visit(ctx.parExpression());
        ifStat.stat = (Stat) visit(ctx.statement(0));
        //for if else stat, can only handle if-else
        if(ctx.statement(1) != null){
            IfElseStat ifElseStat = new IfElseStat();
            ifElseStat.condition = (Expr) visit(ctx.parExpression());
            ifElseStat.stat = (Stat) visit(ctx.statement(0));
            ifElseStat.elseStat = (Stat) visit(ctx.statement(1));
            return ifElseStat;
        }
        return ifStat;
    }

    @Override
    public OutputModelObject visitWhileStat(JParser.WhileStatContext ctx) {
        WhileStat wStat = new WhileStat();
        wStat.condition = (Expr) visit(ctx.parExpression());
        wStat.stat = (Stat)visit(ctx.statement());
        return wStat;
    }

    @Override
    public OutputModelObject visitRetureStat(JParser.RetureStatContext ctx) {
        ReturnStat rStat = new ReturnStat();
        rStat.expr = (Expr) visit(ctx.expression());
        return rStat;
    }

    @Override
    public OutputModelObject visitPrintStat(JParser.PrintStatContext ctx) {
        PrintStat pStat = new PrintStat(ctx.STRING_TYPE().getText());
        List<JParser.ExpressionContext> expressions = ctx.expression();
        List<Expr> strings = new ArrayList<>();
        for(int i=0;i<expressions.size();i++){
            strings.add((Expr) visit(ctx.expression(i)));
        }
        pStat.args = strings;
        return pStat;
    }

    @Override
    public OutputModelObject visitPrintStringStat(JParser.PrintStringStatContext ctx) {
        PrintStringStat psStat = new PrintStringStat(ctx.STRING_TYPE().getText());
        //psStat.content = ctx.STRING_TYPE().getText();
        return psStat;
    }

    @Override
    public OutputModelObject visitLocalVariableDeclaration(JParser.LocalVariableDeclarationContext ctx) {
        VarDef var = new VarDef(ctx.IDENTIFIER().getText());
        var.type = (TypeSpec) visit(ctx.jType());
        return var;
    }

    @Override
    public OutputModelObject visitParExpression(JParser.ParExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public OutputModelObject visitCallStat(JParser.CallStatContext ctx) {
        CallStat cStat = new CallStat();
        cStat.call = visit(ctx.expression());
        return cStat;
    }

    //EXPRESSION

    @Override
    public OutputModelObject visitFIELD_LABLE(JParser.FIELD_LABLEContext ctx) {
        FIELD_LABLE field = new FIELD_LABLE(ctx.IDENTIFIER().getText());
        field.object = (Expr) visit(ctx.expression());
        return field;
    }

    @Override
    public OutputModelObject visitINS_METHOD_CALL_LABLE(JParser.INS_METHOD_CALL_LABLEContext ctx) {

        INS_METHOD_CALL_LABLE imcl;
        String methodName;
        Expr receiver;
        ClassName className;

        FuncPtrType fpt = new FuncPtrType();
        TypeSpec typeSpec;

        //t.id()
        methodName = (ctx.IDENTIFIER()).getText();
        imcl = new INS_METHOD_CALL_LABLE(methodName);
        receiver = new THIS_LABLE();
        className = new ClassName(currentClass.getName());

        imcl.receiver = receiver;
        imcl.className = className;
        //mArg
        List<Expr> mArgs = new ArrayList<>();
        mArgs.add(receiver);
        imcl.args = mArgs;

        //fpt's arg
        //List<TypeSpec> fArgs = new ArrayList<>();
        //className type
        //fpt.argTypes = fArgs;

        Type type = ctx.type;
        if(type instanceof JPrimitiveType){
            typeSpec = new PrimitiveTypeSpec(type.getName());
        }else {
            typeSpec = new ObjectTypeSpec(type.getName());
        }
        fpt.returnType = typeSpec;

        imcl.fptrType=fpt;
        return imcl;
    }

//    METHOD_CALL_LABLE(m, receiver, receiverType, fptrType, args) ::= <<
//            (*<fptrType>(*(<receiver>)->clazz->_vtable)
//            [<className>_<m.name>_SLOT])
//            ((<className> *)(<args:{arg|<arg>};separator=",">))
//            >>
    @Override
    public OutputModelObject visitMETHOD_CALL_LABLE(JParser.METHOD_CALL_LABLEContext ctx) {
        METHOD_CALL_LABLE mcl;
        String methodName;
        Expr receiver;
        ClassName className;

        FuncPtrType fpt = new FuncPtrType();
        TypeSpec typeSpec;

        //id()
        methodName = (ctx.IDENTIFIER()).getText();
        mcl = new METHOD_CALL_LABLE(methodName);
        receiver = new THIS_LABLE();
        className = new ClassName(currentClass.getName());

        mcl.receiver = receiver;
        mcl.className = className;
        //mArg
        List<Expr> mArgs = new ArrayList<>();
        mArgs.add(receiver);
        mcl.args = mArgs;

        //fpt's arg
        List<TypeSpec> fArgs = new ArrayList<>();
        //className type
        fpt.argTypes = fArgs;

        Type type = ctx.type;
        if(type instanceof JPrimitiveType){
            typeSpec = new PrimitiveTypeSpec(type.getName());
        }else {
            typeSpec = new ObjectTypeSpec(type.getName());
        }
        fpt.returnType = typeSpec;

        mcl.fptrType=fpt;
        return mcl;
    }

    @Override
    public OutputModelObject visitCREATOR_LABLE(JParser.CREATOR_LABLEContext ctx) {
        return new CREATOR_LABLE(ctx.creator().getText());
    }

    @Override
    public OutputModelObject visitTHIS_LABLE(JParser.THIS_LABLEContext ctx) {
        return new THIS_LABLE();
    }

    @Override
    public OutputModelObject visitINTEGER_LABLE(JParser.INTEGER_LABLEContext ctx) {
        return new IntRef(ctx.INTEGER_TYPE().getText());
    }

    @Override
    public OutputModelObject visitFLOAT_LABLE(JParser.FLOAT_LABLEContext ctx) {
        return new FloatRef(ctx.FLOAT_TYPE().getText());
    }

    @Override
    public OutputModelObject visitID_LABLE(JParser.ID_LABLEContext ctx) {
        return new VarRef(ctx.IDENTIFIER().getText());
    }

    @Override
    public OutputModelObject visitNULL_LABLE(JParser.NULL_LABLEContext ctx) {
        return new NULL_LABLE();
    }

    @Override
    public OutputModelObject visitCreator(JParser.CreatorContext ctx) {
        return visit(ctx.IDENTIFIER());
    }

}


















