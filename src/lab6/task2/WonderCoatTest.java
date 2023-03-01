package lab6.task2;

import java.util.LinkedList;
import java.util.List;

public class WonderCoatTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John","Smith",55555,10000.0);
        Employee employee2 = new Employee("Alexandra","Jane",11111,20000.0);

        Records wonderCoat = new Records();

        Database abcPaints = new Database();
        WonderCoat abcPaintsAdapter = new ABCPaintsAdapter(abcPaints);

        wonderCoat.insert(employee1);
        abcPaintsAdapter.insert(employee2);

        List<WonderCoat> wonderCoatList = new LinkedList<>();

        wonderCoatList.add(wonderCoat);
        wonderCoatList.add(abcPaintsAdapter);
        for (WonderCoat a : wonderCoatList){
            a.printEmployees();
        }

        wonderCoat.remove(55555);
        abcPaintsAdapter.remove(123);
        for (WonderCoat a : wonderCoatList){
            a.printEmployees();
        }

    }
}
