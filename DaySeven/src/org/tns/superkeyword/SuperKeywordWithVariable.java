package org.tns.superkeyword;

class Building {
    int floors = 23;
    String name = "TNS Building";
}

class Flat extends Building {
    String name = "TNS Flat";
    void print(){
        System.out.println("Super: " + super.name);
        System.out.println("Instance: " + name);

    }
}

public class SuperKeywordWithVariable {
    public static void main(String[] args) {
        System.out.println();
        Flat flat = new Flat();
        System.out.println("Flat name: " + flat.name);
        flat.print();
        System.out.println();

    }
}
