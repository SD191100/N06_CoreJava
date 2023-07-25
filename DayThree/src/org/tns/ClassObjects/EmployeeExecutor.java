package org.tns.ClassObjects;

public class EmployeeExecutor {
    
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.department = "Administration";
        e1.id = 101;
        e1.name = "John Doe";
        e1.salary = 10000.00f;
        e1.diplay();
    }
}
