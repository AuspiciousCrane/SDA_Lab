package Adapter;

import java.util.Vector;

public interface ABCPaints {
    public void addEmployee(Employee employee);
    public void deleteEmployee(long emp_num);
    public boolean isEmployee(long emp_num);
    public Vector getEmployees();
    public void printEmployees();
}
