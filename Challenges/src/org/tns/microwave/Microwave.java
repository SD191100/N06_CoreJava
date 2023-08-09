//  A microwave oven manufacturer recommends when heating two items add 50% to heating time, when heating three items double the heating time. heating more than 3 items at once is not recommended. write a program to calculate the recommended heating time. item = 2, time = 5.0
package org.tns.microwave;


public class Microwave {
    
    static void calc_time(int item, double time) {
        if (item == 2) {
            time = time + (time * 0.5);
        }
        else if (item == 3) {
            time = time * 2;
        }
        else {
            System.out.println("Heating more than 3 items at once is not recommended.");
        }
        System.out.println("Recommended heating time is " + time);
    }

    public static void main(String[] args) {
        int item = 2;
        double time = 5.0;

        calc_time(item, time);
        
        item = 3;
        time = 5.0;

        calc_time(item, time);
    }
}
