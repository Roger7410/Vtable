package cs652.j.codegen.model;

public class IfStat extends Stat{
    @ModelElement public Expr condition;
    @ModelElement public Stat stat;
}
