package org.tns.jaggedarray;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
       System.out.println();
        Scanner s = new Scanner (System.in);

        int arr[][] = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[1];
        arr[2] = new int[3];

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print("Enter the value for arr[" + i + "][" + j + "]: ");
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println();

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
            }
        }

        s.close();
        System.out.println();
    }
}

// Given an array nums of n integers where n > 1. Return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

// input [1, 2, 3, 4]
// output [24, 12, 8, 6]
