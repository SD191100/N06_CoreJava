package org.tns.heriarchicalinheritance;

public class Vehicle {
    private String type;
    private int wheelCount;
    private int engine;
    private String fuelType;

    public String getType() {
        return type;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public int getEngine() {
        return engine;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Vehicle (){
        super();
    }

    public Vehicle (String type, int wheelCount, int engine, String fuelType){
        super();
        this.type = type;
        this.wheelCount = wheelCount;
        this.engine = engine;
        this.fuelType = fuelType;
    }

    
}
