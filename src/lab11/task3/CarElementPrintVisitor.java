package lab11.task3;

public class CarElementPrintVisitor implements CarElementVisitor{
    public void visit(Wheel wheel){
        System.out.println("Visiting " + wheel.getName() + " wheel.");
    }
    public void visit(Body body){
        System.out.println("Visiting Body");
    }
    public void visit(Engine engine){
        System.out.println("Visiting Engine");
    }
    public void visit(Car car){
        System.out.println("Visiting Car");
    }
    
}
