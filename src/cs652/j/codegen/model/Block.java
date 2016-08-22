package cs652.j.codegen.model;

import java.util.List;

public class Block extends Stat{
    @ModelElement public List<VarDef> locals;
    @ModelElement public List<Stat> instrs;
}
