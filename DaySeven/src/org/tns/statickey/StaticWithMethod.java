package org.tns.statickey;

public class StaticWithMethod {

    static int mul = 10;
    static void display (int scr){
        System.out.println("Score is: " + (scr * mul));
    }

    public static void main(String[] args) {
        System.out.println();
        
        display(7);

        System.out.println();
    }
}
