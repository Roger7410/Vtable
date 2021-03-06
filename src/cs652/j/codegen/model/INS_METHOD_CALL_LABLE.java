package cs652.j.codegen.model;

import java.util.List;

public class INS_METHOD_CALL_LABLE extends Expr{
    @ModelElement public Expr receiver;
    @ModelElement public FuncPtrType fptrType;
    @ModelElement public List<Expr> args;
    @ModelElement public ClassName className;
    public INS_METHOD_CALL_LABLE(String name){
        this.name = name;
    }
}
