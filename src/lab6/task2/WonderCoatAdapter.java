package Adapter;

import java.util.Vector;

public class WonderCoatAdapter implements ABCPaints{
    WonderCoat wonderCoat;

    public WonderCoatAdapter(WonderCoat wonderCoat){
        this.wonderCoat = wonderCoat;
    }

    @Override
    public void addEmployee(Employee employee) {
        wonderCoat.insert(employee);
    }

    @Override
    public void deleteEmployee(long emp_num) {
        wonderCoat.remove(emp_num);
    }

    @Override
    public boolean isEmployee(long emp_num) {
        return wonderCoat.isEmployee(emp_num);
    }

    @Override
    public Vector getEmployees() {
        Vector<Employee> employeeVector = new Vector<>(wonderCoat.getEmployees());
        return employeeVector;
    }

    @Override
    public void printEmployees(){
        for (int i = 0; i< getEmployees().size();i++){
            Employee temp = (Employee) getEmployees().get(i);
            System.out.println("Name: " + temp.getName() + " " + temp.getSurname());
            System.out.println("Number: " + temp.getEmpNum());
            System.out.println("Salary: "+temp.getSalary());
        }
    }
}
