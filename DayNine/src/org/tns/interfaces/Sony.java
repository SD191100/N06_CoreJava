package org.tns.interfaces;

public interface  Sony {
    // by default all variables inside interface are public static final
    int noOfChannels = 7;


    void display ();

    static void set(){
        System.out.println("Static");
    }

    default void get(){
        System.out.println("Default");
    }


}
