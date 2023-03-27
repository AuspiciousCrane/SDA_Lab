import java.util.Arrays;
import java.util.Iterator;

public class DinerMenuIterator {
	MenuItem[] item;
    public DinerMenuIterator(MenuItem[] item){
        this.item = item;
    }
    public Iterator iterate(){
        return Arrays.stream(this.item).iterator();
    }
}
