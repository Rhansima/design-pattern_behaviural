
package visitorpattern;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    public void visit(ComputerPart computer){
        System.out.println("Displaying Computer.");
    }
    public void visit(Mouse mouse){
        System.out.println("Displaying mouse.");
    }
    public void visit(Keyboard keyboard){
        System.out.println("Displaying keyboard.");
    }
    public void visit(Monitor monitor){
        System.out.println("Displaying Monitor.");
    }
    
    
}
