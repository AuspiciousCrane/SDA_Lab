package lab3.task2;

public class LED extends TreeDecorator {

    public LED(Tree inTree) {
        this.tree = inTree;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return this.tree.getDescription() + "LED, ";
    }

    @Override
    public double cost() {
        // TODO Auto-generated method stub
        return this.tree.cost() + 10;
    }

}