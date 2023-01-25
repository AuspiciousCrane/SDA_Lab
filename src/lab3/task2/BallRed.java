package lab3.task2;

public class BallRed extends TreeDecorator{

    public BallRed(Tree inTree){
        this.tree = inTree;
    }

    @Override
    public String getDescription() {
        return this.tree.getDescription() + "Ball red, ";
    }

    @Override
    public double cost() {
        return this.tree.cost() + 1;
    }
    
}
