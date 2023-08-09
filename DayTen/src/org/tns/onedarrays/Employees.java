package org.tns.onedarrays;

public class Employees {
    private String name;
    private int ID;

    public int getID(){
        return ID;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setID(int id){
        this.ID = id;
    }

    public Employees (int ID, String name){
        this.ID = ID;
        this.name = name;
    }



}
