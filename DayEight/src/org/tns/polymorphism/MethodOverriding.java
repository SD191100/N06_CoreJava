package org.tns.polymorphism;

class Processor {
    String arch;
    public void process() {
        System.out.println("Processor process");
    }
}

class Intel extends Processor {
    String arch;
    public void process() {
        System.out.println("Intel process");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {
        
        Processor p = new Processor();
        p.process();
        
        Intel i = new Intel();
        i.process();
        
        Processor p1 = new Intel();
        p1.process();
        
        // Intel i1 = new Processor(); // Compiler error
    }
}
