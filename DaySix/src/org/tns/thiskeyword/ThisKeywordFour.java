package org.tns.thiskeyword;

class Director {
    String name;
    void print() {
        this.name = "James Cameron";
        display(name);
    }
    void display(String name){
        System.out.println("Director name: " + name);
    }
    Director (){
        this("James Cameron");
        System.out.println("Director name: " + name);
    }
    Director (String name){
        System.out.println("Director name: " + name);
    }
}

public class ThisKeywordFour {
    public static void main(String[] args) {
        Director d = new Director();
        d.print();
    }
}
