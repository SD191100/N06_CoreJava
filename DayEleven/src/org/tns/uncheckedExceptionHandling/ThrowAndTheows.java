package org.tns.uncheckedExceptionHandling;
// import java.util.*;
public class ThrowAndTheows  {
    static void isEligible (int age, int weight) throws ArithmeticException {
        if (age > 18 && weight > 50) {
            System.out.println(" Sure... give two bottles");
        }
        else {
            throw new ArithmeticException("Sure... take two bottles");
        }
    }
    public static void main(String[] args) {
        isEligible(19, 46);
    }
}
