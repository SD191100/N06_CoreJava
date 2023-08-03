package org.tns.polymorphism;



public class MethodOverloading {

    static void add (int a, int b){
        System.out.println("add(int a, int b) = " + (a + b));
    }

    static void add (int a, int b, int c){
        System.out.println("add(int a, int b, int c) = " + (a + b + c));
    }
    

    
    public static void main(String[] args) {
        System.out.println();
        int a = 10, b = 20, c = 30;

        add(a, b);

        add(a, b, c);

        System.out.println();
    }
}
