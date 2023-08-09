package org.tns.arraysumwithindexdifference;

import java.util.Scanner;
/*    
[1, 2, 3, 4, 5]

sum = 15

[14, 13, 12, 11, 10]

*/ 
public class NestedForLoop {

    static void display (int[] arr,int size,String type){
        System.out.println();
        System.out.println(type + " Array");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + i + " is: " + arr[i]);
        }
        System.out.println();
    }
    
    static void forLoop(int [] arr,int size){
        int[] ans = new int[110];
        int sum = 0;
        for (int i = 0; i < size; i++){
            sum += arr[i];
        }
        for (int i = 0; i < size; i++) {
            int tmp = sum - arr[i];
            ans[i] = tmp;
        }

        display(arr, size, "input");
        display(ans, size, "output");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(n > 0){
            int size = sc.nextInt();
            int[] arr1 = new int[110];

            for (int i = 0; i < size; i++) {
                arr1[i] = sc.nextInt();
            }
        
            forLoop(arr1, size);
            n--;
        }

        sc.close();
    }
}
