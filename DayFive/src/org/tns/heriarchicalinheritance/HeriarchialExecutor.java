package org.tns.heriarchicalinheritance;

public class HeriarchialExecutor {
    
    public static void main(String[] args) {
        
        Brand1 brand1 = new Brand1("BMW", "UK", "Luxury", "Type1", 4, 1000, "Deisel");
        Brand2 brand2 = new Brand2("Ferrari", "USA", "Type2", "SuperCar", 4, 1000, "Petrol");

        System.out.println(brand1);
        System.out.println();
        System.out.println(brand2);
    }
    
}



