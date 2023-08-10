package org.tns.uncheckedExceptionHandling;

public class MultipleCatchBlock {
    static void print (int arr[]){
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException  e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        // you cannot use catch (Exception e) before catch (SpecificException e) but we can use parent after( will handle all remaining)
    }
    public static void main(String[] args) {
        int arr [] = {12, 3, 14};
        print(arr);

    }
}
