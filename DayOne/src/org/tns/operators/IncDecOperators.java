package org.tns.operators;

public class IncDecOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a++; // 10
        int d = ++b; // 21
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = a++ = " + c);
        System.out.println("d = ++b = " + d);
    }
}
