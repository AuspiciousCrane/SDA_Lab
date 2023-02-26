package Adapter;

import java.util.LinkedList;
import java.util.List;

public class ABCPaintsTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John","Doe",12345,10000.0);
        Employee employee2 = new Employee("Mary","Jane",54321,20000.0);

        Database abcPaints = new Database();

        Records wonderCoat = new Records();
        ABCPaints wonderCoatAdapter = new WonderCoatAdapter(wonderCoat);

        abcPaints.addEmployee(employee1);
        wonderCoatAdapter.addEmployee(employee2);

        List<ABCPaints> abcPaintsList = new LinkedList<>();

        abcPaintsList.add(abcPaints);
        abcPaintsList.add(wonderCoatAdapter);

        for (ABCPaints a : abcPaintsList){
            a.printEmployees();
        }
        abcPaints.deleteEmployee(1);

    }
}
