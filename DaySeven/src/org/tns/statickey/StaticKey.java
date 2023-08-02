package org.tns.statickey;

public class StaticKey {
    static String str = "TNS";

    public static void main(String[] args) {
        System.out.println();

        System.out.println("str: " + str);

        StaticKey sk = new StaticKey();
        System.out.println("sk.str: " + sk.str);

        System.out.println();
    }
}
