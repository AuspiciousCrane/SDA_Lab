package lab8.task3;


import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator {
    ArrayList item;
    public PancakeHouseMenuIterator(ArrayList item){
        this.item = item;
    }
    public Iterator iterate(){
		return this.item.iterator();
	}
}
