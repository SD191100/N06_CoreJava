package edu.kkw.admin;

import edu.met.library.Library;
// import edu.met.library.*; // import all classes from edu.met.library package

public class Faculty {
    
    public static void main(String[] args) {
        Library library = new Library();
        
        // These two lines will compile as it is public. We can access public members outside the class and outside packages.
        library.name = "MET Library";
        library.displayPublic();

        // These two lines will not compile as they are private. We can't access private members outside the class.
        // library.id = 100;
        // library.displayPrivate();

        // These two lines will not compile as they are default. We can't access default members outside the package.
        // library.bookName = "Java";
        // library.displayDefault();
    }
}
