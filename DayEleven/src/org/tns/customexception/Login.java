package org.tns.customexception;

public class Login extends Exception {
    private String name;

    public Login (String str) {
        super();
        this.name = str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString () {
        return "Str[" + name + "]";
    }
}
