package lab3.task2;

public class BallSilver extends TreeDecorator {

    BallSilver(Tree inTree){
        this.tree = inTree;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return this.tree.getDescription() + "ballSilver, ";
    }

    @Override
    public double cost() {
        // TODO Auto-generated method stub
        return this.tree.cost() + 3;
    }
    
}
