package org.tns.uncheckedExceptionHandling;

public class ArrayIndexOutOfBoundException {
    static void display (int arr[]) {
        try {
            System.out.println(arr[5]);
        } catch (Exception e) {

            System.out.println("Exception handled: " + e);

        } finally {
            System.out.println("Finally block is always executed ");
        }
        System.out.println("Any statement outside the try catch block is always executed");
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println();
        display(arr);
        System.out.println();
    }
}
