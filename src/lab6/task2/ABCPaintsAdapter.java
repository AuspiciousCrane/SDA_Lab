package lab6.task2;

import java.util.ArrayList;

public class ABCPaintsAdapter implements WonderCoat {
    ABCPaints abcPaints;
    public ABCPaintsAdapter(ABCPaints abcPaints){
        this.abcPaints = abcPaints;
    }

    @Override
    public void insert(Employee employee) {
        abcPaints.addEmployee(employee);
    }

    @Override
    public void remove(long emp_num) {
        abcPaints.deleteEmployee(emp_num);
    }

    @Override
    public boolean isEmployee(long emp_num){
        return abcPaints.isEmployee(emp_num);
    }

    @Override
    public ArrayList getEmployees() {
        ArrayList<Employee> employeeArrayList = new ArrayList<>(abcPaints.getEmployees());
        return employeeArrayList;
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
