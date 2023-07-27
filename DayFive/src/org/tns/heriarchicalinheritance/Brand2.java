package org.tns.heriarchicalinheritance;

public class Brand2 extends Vehicle {
    
    private String brandName;
    private String brandCountry;
    private String brandType;

    public String getBrandName() {
        return brandName;
    }

    public String getBrandCountry() {
        return brandCountry;
    }

    public String getBrandType() {
        return brandType;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setBrandCountry(String brandCountry) {
        this.brandCountry = brandCountry;
    }

    public void setBrandType(String brandType) {
        this.brandType = brandType;
    }

    public void printBrandDetails() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Brand Country: " + brandCountry);
        System.out.println("Brand Type: " + brandType);
    }

    public Brand2 (){
        super();
    }

    public Brand2 (String brandName, String brandCountry, String brandType, String type, int wheelCount, int engine, String fuelType){
        super(type, wheelCount, engine, fuelType);
        this.brandName = brandName;
        this.brandCountry = brandCountry;
        this.brandType = brandType;
    }

    public String toString(){
        return "Brand Name: " + brandName + "\nBrand Country: " + brandCountry + "\nBrand Type: " + brandType + "\nType: " + getType() + "\nWheel Count: " + getWheelCount() + "\nEngine: " + getEngine() + "\nFuel Type: " + getFuelType();
    }

}
