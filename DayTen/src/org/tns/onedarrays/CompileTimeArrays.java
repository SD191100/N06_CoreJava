package org.tns.onedarrays;

public class CompileTimeArrays {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = {10,2,55,13};
        for (int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();



        int [] x = new int[5];
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 4;
        x[4] = 5;

        System.out.println("x[0] = " + x[0]);
        System.out.println("x[1] = " + x[1]);
        System.out.println("x[2] = " + x[2]);
        System.out.println("x[3] = " + x[3]);
        System.out.println("x[4] = " + x[4]);

        // float [] y = new float[5]
        System.out.println();
    }

}
