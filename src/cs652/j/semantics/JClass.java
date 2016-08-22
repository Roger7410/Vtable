package cs652.j.semantics;

import org.antlr.symtab.*;
//import org.antlr.symbols.ClassSymbol;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;


/** A symbol representing the class. It is a kind of data aggregate
 *  that has much in common with a struct.
 */

public class JClass extends ClassSymbol {
    //protected String superClassName; // null if this is Object
    //protected int nextFreeMethodSlot = 0; // next slot to allocate
    public JClass(String name, ParserRuleContext tree) {
        super(name);
        setDefNode(tree);
    }
}


