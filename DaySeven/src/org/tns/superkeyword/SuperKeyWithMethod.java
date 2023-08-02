package org.tns.superkeyword;

class MET {
    String owner = "Chaggan Bhujbal";

    void display() {
        System.out.println("Owner: " + owner);
    }
}

class BKC extends MET {
    String owner = "Shefali Bhujbal";

    void display() {
        super.display();
        System.out.println("Owner: " + owner);
    }
}

public class SuperKeyWithMethod {
    public static void main(String[] args) {
        BKC bkc = new BKC();
        bkc.display();
    }
}
