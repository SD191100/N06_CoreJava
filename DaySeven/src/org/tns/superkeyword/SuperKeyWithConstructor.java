package org.tns.superkeyword;

class Google {
    String owner = "Larry Page";
    Google(String owner) {
        System.out.println("Google's constructor with owner: " + owner);
    }
}

class Android extends Google {
    String name = "Android";
    public Android(String owner, String name) {
        super(owner);
        System.out.println("Android's constructor with owner: " + owner + " and name: " + name);
    }
}

public class SuperKeyWithConstructor {
    public static void main(String[] args) {
        System.out.println();
        Android android = new Android("Larry Page", "Android");
        System.out.println("Android's owner: " + android.owner);
        System.out.println();
    }
}
