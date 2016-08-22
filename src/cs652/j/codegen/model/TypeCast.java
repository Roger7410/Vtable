package cs652.j.codegen.model;

public class TypeCast extends Expr{
    @ModelElement public TypeSpec type;
    @ModelElement public Expr expr;
}
