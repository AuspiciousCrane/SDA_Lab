package lab3.task2;

public class Light extends TreeDecorator {

    public Light(Tree inTree) {
        this.tree = inTree;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return this.tree.getDescription() + "Lights, ";
    }

    @Override
    public double cost() {
        // TODO Auto-generated method stub
        return this.tree.cost() + 5;
    }

}