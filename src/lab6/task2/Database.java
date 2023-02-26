/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;
import java.util.Vector;

/**
 *
 * @author boonjv
 */
public class Database implements ABCPaints {

    private Vector employees; //Stores the employees
    public Database() {
        employees = new Vector();
    }

    public void addEmployee(Employee employee) {
        //Code to add employee
        this.getEmployees().add(employee);
    }

    public void deleteEmployee(long emp_num) {
        //Code to delete employee
        long temp = 0;
        int i = 0;
        while (temp != emp_num && i < this.getEmployees().size()){
            Employee tempEmpObj = (Employee) this.getEmployees().get(i);
            temp = tempEmpObj.getEmpNum();
            if (temp == emp_num){
                this.getEmployees().remove(i);
                System.out.println("Remove employee: " + temp);
                break;
            }
            i+=1;
            if (i == this.getEmployees().size()){
                System.out.println("NO Employee with this number "+emp_num);
            }
        }
    }

    public boolean isEmployee(long emp_num) {
        long temp = 0;
        int i = 0;
        while (temp != emp_num && i < this.getEmployees().size()){
            Employee tempEmpObj = (Employee) this.getEmployees().get(i);
            temp = tempEmpObj.getEmpNum();
            if (temp == emp_num){
                System.out.println("Exist: " + temp);
                return true;
            }
            i+=1;
        }
        return false;
    }

    public Vector getEmployees() {
        return employees;
    }

    public void printEmployees(){
        for (int i = 0; i< getEmployees().size();i++){
            Employee temp = (Employee) getEmployees().get(i);
            System.out.println("Name: " + temp.getName() + " " + temp.getSurname());
            System.out.println("Number: " + temp.getEmpNum());
            System.out.println("Salary: "+temp.getSalary());
        }
    }
}
