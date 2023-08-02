package org.tns.statickey;

public class StaticBlock {

    String str;
    static float sal;
    static int age;

    static {
        sal = 17000.90f;
        // str = "BKC";
        age = 76;
    }

    // static void display () {
    //     System.out.println("Salary: " + sal);
    //     System.out.println("Age: " + age);
    // }

    public static void main(String[] args) {
        System.out.println();

        System.out.println("Salary: " + sal);
        System.out.println("Age: " + age);
        
        System.out.println();
    }
}
