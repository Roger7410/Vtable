package cs652.j.codegen.model;

import java.util.List;

public class ClassDef extends OutputModelObject{
    public final String name;
    @ModelElement public List<VarDef> fields;
    @ModelElement public List<MethodDef> methods;
    @ModelElement public List<VTable> vtable;

    public ClassDef(String name) {
        this.name = name;
    }
}
