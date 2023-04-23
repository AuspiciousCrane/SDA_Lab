package lab11.task3;

public class CarElementDoVisitor implements CarElementVisitor{
    public void visit(Wheel wheel){
        System.out.println("Kicking my " + wheel.getName() + " wheel");
    }
    public void visit(Body body){
        System.out.println("Waxing my body");
    }
    public void visit(Engine engine){
        System.out.println("Starting my engine");
    }
    public void visit(Car car){
        System.out.println("Starting my car");
    }
    
}
