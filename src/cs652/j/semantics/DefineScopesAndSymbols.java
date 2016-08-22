package cs652.j.semantics;

import cs652.j.parser.JBaseListener;
import cs652.j.parser.JParser;
import org.antlr.symtab.*;

public class DefineScopesAndSymbols extends JBaseListener {
	public Scope currentScope;

	public DefineScopesAndSymbols(GlobalScope globals) {
		currentScope = globals;
        currentScope.define((Symbol)ComputeTypes.JINT_TYPE);
        currentScope.define((Symbol)ComputeTypes.JFLOAT_TYPE);
        currentScope.define((Symbol)ComputeTypes.JSTRING_TYPE);
        currentScope.define((Symbol)ComputeTypes.JVOID_TYPE);
	}

    @Override
    public void enterFile(JParser.FileContext ctx) {
        ctx.scope = (GlobalScope)currentScope;
    }

    @Override
    public void exitFile(JParser.FileContext ctx) {
        popScope();
    }
    //define!!!!!!!!!
    @Override
    public void enterMain(JParser.MainContext ctx) {
        JMethod jMethod = new JMethod("main",ctx);
        jMethod.setEnclosingScope(currentScope);
        currentScope.define(jMethod);
        ctx.scope = jMethod;
        jMethod.setType(ComputeTypes.JVOID_TYPE);
        pushScope(jMethod);
    }

    @Override
    public void exitMain(JParser.MainContext ctx) {
        popScope();
    }

//    @Override
//    public void enterMainblock(JParser.MainblockContext ctx) {
//        LocalScope lScope = new LocalScope(currentScope);
//        ctx.scope = lScope;
//        pushScope(lScope);
//    }
//
//    @Override
//    public void exitMainblock(JParser.MainblockContext ctx) {
//        popScope();
//    }

    @Override
    public void enterClassDeclaration(JParser.ClassDeclarationContext ctx) {
        JClass jClass = new JClass(ctx.name.getText(),ctx);
        jClass.setEnclosingScope(currentScope);
        if (ctx.superclass != null){
            jClass.setSuperClass(ctx.superclass.getText());
        }
        currentScope.define(jClass);
        ctx.scope = jClass;
        pushScope(jClass);
    }

    @Override
    public void exitClassDeclaration(JParser.ClassDeclarationContext ctx) {
        popScope();
    }

    @Override
    public void enterMethodDeclaration(JParser.MethodDeclarationContext ctx) {
        JMethod jMethod = new JMethod(ctx.IDENTIFIER().getText(),ctx);
        jMethod.setEnclosingScope(currentScope);
        currentScope.define(jMethod);
        //if (ctx.jType().getText().equals("void")){
        //    jMethod.setType(ComputeTypes.JVOID_TYPE);
        //}
        //else{
            jMethod.setType((Type) currentScope.resolve(ctx.jType().getText()));
        //}
        ctx.scope = jMethod;

        pushScope(jMethod);
        //for test
        JField jField = new JField("this");
        currentScope.define(jField);
        jField.setType((JClass) currentScope.getEnclosingScope());
    }

    @Override
    public void exitMethodDeclaration(JParser.MethodDeclarationContext ctx) {
        popScope();
    }

    @Override
    public void enterBlock(JParser.BlockContext ctx) {
        LocalScope lScope = new LocalScope(currentScope);
        ctx.scope = lScope;
        pushScope(lScope);
    }

    @Override
    public void exitBlock(JParser.BlockContext ctx) {
        popScope();
    }

    //new -> setScope -> define -> setType
    @Override
    public void enterFieldDeclaration(JParser.FieldDeclarationContext ctx) {
//        String debug = ctx.IDENTIFIER().getText();
//        System.out.println(debug);
        JField jField = new JField(ctx.IDENTIFIER().getText());
        jField.setScope(currentScope);
        currentScope.define(jField);
        jField.setType((Type) currentScope.resolve(ctx.jType().getText()));
    }

    @Override
    public void enterFormalParameter(JParser.FormalParameterContext ctx) {
        JArg jArg = new JArg(ctx.IDENTIFIER().getText());
        jArg.setScope(currentScope);
        currentScope.define(jArg);
        jArg.setType((Type) currentScope.resolve(ctx.jType().getText()));
    }

//    @Override
//    public void enterVariable(JParser.VariableContext ctx) {
//        JVar jVar = new JVar(ctx.IDENTIFIER().getText());
//        jVar.setScope(currentScope);
//        currentScope.define(jVar);
//        jVar.setType((Type) currentScope.resolve(ctx.jType().getText()));
//    }

    @Override
    public void enterLocalVariableDeclaration(JParser.LocalVariableDeclarationContext ctx) {
        JVar jVar = new JVar(ctx.IDENTIFIER().getText());
        jVar.setScope(currentScope);
        currentScope.define(jVar);
        jVar.setType((Type) currentScope.resolve(ctx.jType().getText()));
    }

    private void pushScope(Scope s) {
        if (!(s instanceof Symbol)){ //MARK
            currentScope.nest(s);
        }
        currentScope = s;
        //System.out.println("1entering: "+currentScope.getName()+":"+currentScope);
    }

    private void popScope() {
        //System.out.println("1leaving: "+currentScope.getName()+":"+currentScope);
        currentScope = currentScope.getEnclosingScope();
    }
}
