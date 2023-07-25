package org.tns.ClassObjects;

public class LibraryExecutor {
    public static void main(String[] args) {
        Library l1 = new Library();
        l1.display();
        Library l2 = new Library(100, "The Alchemist","Paulo Coelho", 500.00f);
        l2.display();
        System.out.println(l1.toString());
    }
}
