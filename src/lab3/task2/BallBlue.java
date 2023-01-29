package lab3.task2;

public class BallBlue extends TreeDecorator{

    public BallBlue(Tree inTree){
        this.tree = inTree;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return this.tree.getDescription() + "BallBlue, ";
    }

    @Override
    public double cost() {
        // TODO Auto-generated method stub
        return this.tree.cost() + 2;
    }
    
}