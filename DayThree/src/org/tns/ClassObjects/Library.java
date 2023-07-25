package org.tns.ClassObjects;
//
public class Library {
    // public Data Members
    public long numberOfBooks;
    public String name;
    public String author;
    public float price;
    // Default Constructor
    public Library () {
        numberOfBooks = 0;
        name = "Unknown";
        author = "Unknown";
        price = 0.0f;
        System.out.println("Default Constructor Called");
    }

    public Library (long numberOfBooks, String name, String author, float price) {
        this.numberOfBooks = numberOfBooks;
        this.name = name;
        this.author = author;
        this.price = price;
        System.out.println("Parameterized Constructor Called");
    }

    public String toString() {
        return "Name: " + name + "\nAuthor: " + author + "\nNumber of Books: " + numberOfBooks + "\nPrice: " + price;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Number of Books: " + numberOfBooks);
        System.out.println("Price: " + price);
    }



}
