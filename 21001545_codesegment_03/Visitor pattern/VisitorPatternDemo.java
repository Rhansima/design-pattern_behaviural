
package visitorpattern;

public class VisitorPatternDemo {
    public static void main(String[] args){
        ComputerPart computer=new ComputerPart();
        computer.accept(new ComputerPartDisplayVisitor());
    }
    
}
