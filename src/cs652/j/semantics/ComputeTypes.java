package cs652.j.semantics;

import cs652.j.parser.JBaseListener;
import cs652.j.parser.JParser;
import org.antlr.symtab.GlobalScope;
import org.antlr.symtab.Symbol;
import org.antlr.symtab.Type;
import org.antlr.symtab.Scope;
import org.antlr.symtab.TypedSymbol;
import org.antlr.symtab.VariableSymbol;
import org.antlr.v4.runtime.misc.NotNull;

public class ComputeTypes extends SetScope { //extends
	protected StringBuilder buf = new StringBuilder();

	public static final Type JINT_TYPE = new JPrimitiveType("int");
	public static final Type JFLOAT_TYPE = new JPrimitiveType("float");
	public static final Type JSTRING_TYPE = new JPrimitiveType("string");
	public static final Type JVOID_TYPE = new JPrimitiveType("void");

	public ComputeTypes(GlobalScope globals) {
		this.currentScope = globals;
	}

//    expression  returns [Type type] // annotate all expression nodes with type info
//    :   expression '.' IDENTIFIER                               # FIELD_LABLE
//    |   expression '.' IDENTIFIER '(' expressionList? ')'       # INS_METHOD_CALL_LABLE
//    |   'new' creator                                           # CREATOR_LABLE
//    |   IDENTIFIER '(' expressionList? ')'                      # METHOD_CALL_LABLE
//    |   '(' expression ')'                                      # PARENS_LABLE
//    |   'this'                                                  # THIS_LABLE
//    |   INTEGER_TYPE                                            # INTEGER_LABLE
//    |   FLOAT_TYPE                                              # FLOAT_LABLE
//    |   IDENTIFIER                                              # ID_LABLE
//    |   'null'                                                  # NULL_LABLE
//    ;

    @Override
    public void exitINS_METHOD_CALL_LABLE(JParser.INS_METHOD_CALL_LABLEContext ctx) {
        Type type = ctx.expression().type;
        if (type != null) {
            ctx.type = ((TypedSymbol) ((JClass) type).resolve(ctx.IDENTIFIER().getText())).getType();
            buf.append(ctx.getText() + " is " + ctx.type.getName() + "\n");
        }
    }

    @Override
    public void exitMETHOD_CALL_LABLE(JParser.METHOD_CALL_LABLEContext ctx) {
        if (ctx.IDENTIFIER().getText() != null) {
            ctx.type = ((TypedSymbol) currentScope.resolve(ctx.IDENTIFIER().getText())).getType();
            buf.append(ctx.getText() + " is " + ctx.type.getName() + "\n");
        }
    }

    @Override
    public void exitFIELD_LABLE(JParser.FIELD_LABLEContext ctx) {
        Type type = ctx.expression().type;
        if (type != null) {
            ctx.type = ((TypedSymbol) ((JClass) type).resolve(ctx.IDENTIFIER().getText())).getType();
//        if (((JClass) type).resolve(ctx.IDENTIFIER().getText()) instanceof JMethod){
//            return;
//        }else if(((JClass) type).resolve(ctx.IDENTIFIER().getText()) instanceof JField){
            buf.append(ctx.getText() + " is " + ctx.type.getName() + "\n");
//        }
        }
    }

    @Override
    public void exitTHIS_LABLE(JParser.THIS_LABLEContext ctx) {
        Scope s = currentScope;
        boolean flag = false;
        while (s != null){
            if(s instanceof JClass){
                ctx.type = (JClass)s;
                flag = true;
                break;
            }
            s = s.getEnclosingScope();
        }
        if (!flag) {
            ctx.type = null;
        }
        if(ctx.type != null) {
            buf.append(ctx.getText() + " is " + ctx.type.getName() + "\n");
        }
    }



    @Override
    public void exitNULL_LABLE(JParser.NULL_LABLEContext ctx) {
        ctx.type =JVOID_TYPE;
        buf.append("null is " + JVOID_TYPE.getName() + "\n");
    }

    @Override
    public void exitID_LABLE(JParser.ID_LABLEContext ctx) {
        Symbol symbol = currentScope.resolve(ctx.IDENTIFIER().getText());//null pointer
        if (symbol != null && symbol instanceof TypedSymbol){
            ctx.type = ((TypedSymbol)symbol).getType();
            buf.append(ctx.getText() + " is " + ctx.type.getName() + "\n");
        }
    }

    @Override
    public void exitCREATOR_LABLE(JParser.CREATOR_LABLEContext ctx) {
        JClass symbol = (JClass)currentScope.resolve(ctx.creator().IDENTIFIER().getText());
        ctx.type = symbol;
        buf.append(ctx.getText() + " is " + ctx.type.getName() + "\n");
    }

    @Override
    public void exitINTEGER_LABLE(JParser.INTEGER_LABLEContext ctx) {
        ctx.type = JINT_TYPE;
        buf.append(ctx.INTEGER_TYPE() + " is " + JINT_TYPE.getName() + "\n");
    }

    @Override
    public void exitFLOAT_LABLE(JParser.FLOAT_LABLEContext ctx) {
        ctx.type = JFLOAT_TYPE;
        buf.append(ctx.FLOAT_TYPE() + " is " + JFLOAT_TYPE.getName() + "\n");
    }

    // S U P P O R T

	public String getRefOutput() {
        return buf.toString();
	}

}

