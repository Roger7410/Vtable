package cs652.j.codegen.model;

public class AssignStat extends Stat{
    @ModelElement public Expr assoc;
    @ModelElement public Expr right;
}
