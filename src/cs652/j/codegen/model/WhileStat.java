package cs652.j.codegen.model;

public class WhileStat extends Stat{
    @ModelElement public Expr condition;
    @ModelElement public Stat stat;
}
