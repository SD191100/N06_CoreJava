// Write a program to calculate hotel tarrif. room rent is 20% high during peak season (apr-june,  nov-dec). ask the user for check in and check out date and calculate the total tarrif.
// 11, 12, 4, 5, 6
// days =2 month=3 rent=1500
package org.tns.hotel;

public class Hotel {
    
    static void calc_Tarrif (int days, int month, double rent) {
        if (month == 11 || month == 12 || month == 4 || month == 5 || month == 6) {
            rent = rent + (rent * 0.2);
        }
        double total = rent * days;
        System.out.println("Total tarrif is " + total);
    }
    public static void main(String[] args) {
        
        int days = 2;
        int month = 5;
        double rent = 2000;

        calc_Tarrif(days, month, rent);
    }
}
