package org.tns.multidarray;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int arr[][] = new int[2][2];
        for(int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println();

        for(int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++) {
                System.out.println("arr["+ i  + "][" + j + "] = " + arr[i][j]);
            }
        }
        s.close();
    }

}

