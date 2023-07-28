// Ask a user for their birth year encoded as two digits (like "01") and for the current year also encoded as two digits ( like "23"). write a program to find the users current age in years.
package org.tns.agecalculator;

public class AgeCalculator {

    static void ageCalculator(int birth_year, int curr_year) {
        int age;
        if (curr_year > birth_year) {
            age = curr_year - birth_year;
        } 
        else {
            age = (100 - birth_year) + curr_year;
        }

        System.out.println("Your age is " + age);
    }

    public static void main(String[] args) {
        int birth_year = 01;
        int curr_year = 23;
        ageCalculator(birth_year, curr_year);
        birth_year = 96;
        curr_year = 23;
        ageCalculator(birth_year, curr_year);
    }
}
// 2023
// 
// Write a program to calculate hotel tarrif. room rent is 20% high during peak season (apr-june,  nov-dec). ask the user for check in and check out date and calculate the total tarrif.
// days =2 month=3 rent=1500

// A microwave oven manufacturer recommends when heating two items add 50% to heating time, when heating three items double the heating time. heating more than 3 items at once is not recommended. write a program to calculate the recommended heating time. item = 2, time = 5.0

