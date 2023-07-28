package edu.met.library;
// 
public class Library {
    // public, private, protected, default
    public String name;    
    
    private int id;
    
    String bookName;

    public void displayPublic () {
        System.out.println("displayPublic() called \nName: " + name);
    }

    private void displayPrivate() {
        System.out.println("displayPrivate() called \nID: " + id );
    }

    void displayDefault() {
        System.out.println("displayDefault() called \nBooksName: " + bookName);
    }

}
