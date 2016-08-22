package cs652.j.codegen.model;

import java.util.List;

public class PrintStat extends Stat{
    public String name;
    @ModelElement public List<Expr> args;
    public PrintStat(String name){this.name = name;}
}
