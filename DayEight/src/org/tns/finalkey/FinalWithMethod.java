package org.tns.finalkey;
class Laptop {
    final String PROCESSOR = "AMD";

    final void display () {
        System.out.println();
        System.out.println("Class: Laptop\nProcessor: " + PROCESSOR);
        System.out.println();
    }
}

class HP extends Laptop {
    void display(String Ram) {
        System.out.println();
        System.out.println("Class: HP\nProcessor: " + PROCESSOR + "\nRAM: " + Ram);
        System.out.println();
    }
}

public class FinalWithMethod {
    public static void main(String[] args) {
        HP h = new HP();
        h.display();
        h.display("3600mhz");
    }
}
