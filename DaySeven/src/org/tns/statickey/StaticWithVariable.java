package org.tns.statickey;

class Employee {
    private String name;
    private static int id = 0;
    private static String company = "TNS";

    Employee(){
        id++;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
    public String getCompany(){
        return company;
    }
    public int getID(){
        return id;
    }
    
    void display() {
        System.out.println("Name: " + name + " Id: " + id + " Company: " + company);
    }
}

public class StaticWithVariable {
    public static void main(String[] args) {
        System.out.println();
        Employee e1 = new Employee();
        e1.setName("Raj");
        // e1.setCompany("TNS");
        e1.display();

        Employee e2 = new Employee();
        e2.setName("Ravi");
        // e2.setCompany("TNS");
        e2.display();
        System.out.println();
    }
}
