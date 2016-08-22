package cs652.j.codegen.model;

public class VarDef extends OutputModelObject{
    public final String name;
    public TypeSpec type;

    public VarDef(String name) {
        this.name = name;
    }
}
