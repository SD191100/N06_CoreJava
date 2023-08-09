package org.tns.onedarrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOfArray {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter total no. of arrays");
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            
            arr[i] = s.nextInt();
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("The largest element is " + max);

        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        s.close();
    }
}
