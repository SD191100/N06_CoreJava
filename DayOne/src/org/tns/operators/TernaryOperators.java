package org.tns.operators;

public class TernaryOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a > b ? a : b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = a > b ? a : b = " + c);
    }
}
