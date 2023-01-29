package lab3.task2;

public class Ribbon extends TreeDecorator {

    public Ribbon(Tree inTree) {
        this.tree = inTree;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return this.tree.getDescription() + "Ribbon, ";
    }

    @Override
    public double cost() {
        // TODO Auto-generated method stub
        return this.tree.cost() + 2;
    }
    
}