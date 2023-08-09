package org.tns.interfaces;

public class Human implements ColdDrink, Alcohol {
    
    public void display(){
        System.out.println(coldDrinkName + " " + alcohol);
    } 
}
