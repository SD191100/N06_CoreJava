package org.tns.operators;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a & b; // 0
        int d = a | b; // 30
        int e = a ^ b; // 30
        int f = ~a; // -11
        int g = a << 2; // 40
        int h = a >> 2; // 2
        int i = a >>> 2; // 2
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = a & b = " + c);
        System.out.println("d = a | b = " + d);
        System.out.println("e = a ^ b = " + e);
        System.out.println("f = ~a = " + f);
        System.out.println("g = a << 2 = " + g);
        System.out.println("h = a >> 2 = " + h);
        System.out.println("i = a >>> 2 = " + i);
    }
}

// 8 4 2 1
// 1 0 1 0
