package cs652.j.codegen.model;

public class FIELD_LABLE extends Expr{
    public String name;
    @ModelElement public Expr object;

    public FIELD_LABLE(String name) {
        this.name = name;
    }
}
