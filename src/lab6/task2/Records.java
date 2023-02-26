/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.task2;

import java.util.ArrayList;

/**
 *
 * @author boonjv
 */
public class Records implements WonderCoat{

    private ArrayList employees; //Stores the employees

    public Records() {
        employees = new ArrayList();
    }

    public void insert(Employee employee) {
        //Code to insert employee
        this.employees.add(employee);
    }

    public void remove(long emp_num) {
        //Code to remove employee
        if (isEmployee(emp_num)==false){
            System.out.println("NO Employee with this number "+emp_num);
            return;
        }
        long temp = 0;
        int i = 0;
        while (temp != emp_num && i < this.employees.size()){
            Employee tempEmpObj = (Employee) this.employees.get(i);
            temp = tempEmpObj.getEmpNum();
            if (temp == emp_num){
                this.employees.remove(i);
                System.out.println("Remove employee: " + temp);
                break;
            }
            i+=1;
        }
    }

    public boolean isEmployee(long emp_num) {
        //Code to find employee
        long temp = 0;
        int i = 0;
        while (temp != emp_num && i < this.employees.size()){
            Employee tempEmpObj = (Employee) this.employees.get(i);
            temp = tempEmpObj.getEmpNum();
            if (temp == emp_num){
                System.out.println("Exist: " + temp);
                return true;
            }
            i+=1;
        }
        return false;
    }

    @Override
    public ArrayList getEmployees() {
        return this.employees;
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
