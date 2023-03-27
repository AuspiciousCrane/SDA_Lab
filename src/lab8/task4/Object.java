package lab8.task4;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Object extends Object_Component {

    private List<Object_Component> children;

    Object(){
        this.children = new ArrayList<Object_Component>();
    }

    @Override
    public void render() {
        for(Object_Component child: children){
            child.render();
        }
    }

    @Override
    public float volume() {
        float total_volume = 0;
        for (Object_Component child: children){
            total_volume += child.volume();
        }
        return total_volume;
    }

    @Override
    public Iterator createIterator(){
        return new CompositeIterator(children.iterator());
    }
    
    public void add(Object_Component child){
        children.add(child);
    }

    public void remove(Object_Component child){
        children.remove(child);
    }

}
