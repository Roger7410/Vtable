package cs652.j.semantics;

import cs652.j.parser.JBaseListener;
import cs652.j.parser.JParser;
import org.antlr.symtab.Scope;

/**
 * Created by JOKER on 3/5/16.
 */
public class SetScope extends JBaseListener {
    public Scope currentScope;

    private void pushScope(Scope s) {
        currentScope = s;
        //System.out.println("enter: "+currentScope.getName() + " === " + s);
    }

    private void popScope() {
        //System.out.println("exit: "+currentScope.getName() + " === " + currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterFile(JParser.FileContext ctx) {
        pushScope(ctx.scope);
    }

    @Override
    public void exitFile(JParser.FileContext ctx) {
        popScope();
    }

    @Override
    public void enterClassDeclaration(JParser.ClassDeclarationContext ctx) {
        pushScope(ctx.scope);
    }

    @Override
    public void exitClassDeclaration(JParser.ClassDeclarationContext ctx) {
        popScope();
    }

    @Override
    public void enterMain(JParser.MainContext ctx) {
        pushScope(ctx.scope);
    }

    @Override
    public void exitMain(JParser.MainContext ctx) {
        popScope();
    }

//    @Override
//    public void enterMainblock(JParser.MainblockContext ctx) {
//        pushScope(ctx.scope);
//    }
//
//    @Override
//    public void exitMainblock(JParser.MainblockContext ctx) {
//        popScope();
//    }

    @Override
    public void enterMethodDeclaration(JParser.MethodDeclarationContext ctx) {
        pushScope(ctx.scope);
    }

    @Override
    public void exitMethodDeclaration(JParser.MethodDeclarationContext ctx) {
        popScope();
    }

    @Override
    public void enterBlock(JParser.BlockContext ctx) {
        //System.out.println("??local before cur " + currentScope + " enclosing" + currentScope.getEnclosingScope());
        pushScope(ctx.scope);
        //System.out.println("??local after cur " + currentScope + " enclosing" + currentScope.getEnclosingScope());
    }

    @Override
    public void exitBlock(JParser.BlockContext ctx) {
        //System.out.println("exit be local?? cur " + currentScope + " enclosing" + currentScope.getEnclosingScope());
        popScope();
        //System.out.println("exit a local?? cur " + currentScope + " enclosing" + currentScope.getEnclosingScope());
    }
}
