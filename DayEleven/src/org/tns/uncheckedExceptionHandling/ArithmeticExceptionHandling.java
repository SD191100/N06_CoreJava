package org.tns.uncheckedExceptionHandling;

import java.util.Scanner;

public class ArithmeticExceptionHandling {

    public static void main(String[] args) {
        System.out.println();
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = 0;
        try {
            System.out.println(x/y);
        } catch (Exception e) {
            System.out.println("Exception handled: " + e);
        }
        

        s.close();
        System.out.println();
    }
}
