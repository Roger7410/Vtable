package cs652.j.codegen.model;

import java.util.List;

public class MethodDef extends OutputModelObject {
    @ModelElement public FuncName funcName;
    @ModelElement public TypeSpec returnType;
    @ModelElement public List<VarDef> args;
    @ModelElement public Block body;
}
