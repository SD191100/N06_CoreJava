package org.tns.onedarrays;

public class Executor {

    public static void main(String[] args) {
        System.out.println();
        Employees arr[] = new Employees[3];

        arr[0] = new Employees(101, "Kunal");
        arr[1] = new Employees(102, "Ashutosh");
        arr[2] = new Employees(103, "Sahil");

        for (int  i = 0; i < arr.length; i++) {
            System.out.println("ID: " + arr[i].getID() + " Name: " + arr[i].getName());
        }
        System.out.println();
    }
}
