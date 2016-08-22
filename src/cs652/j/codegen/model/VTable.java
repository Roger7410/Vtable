package cs652.j.codegen.model;

public class VTable extends OutputModelObject implements Comparable<VTable>{
    public int slot;
    @ModelElement public ClassName className;
    @ModelElement public FuncName funcName;

    @Override
    public int compareTo(VTable o) {
        return this.slot-o.slot;
    }
}
