package org.tns.instanceofdemo;

class RBI {
    protected String ifscCode;
}

class SBI extends RBI {

    public SBI(){
        super.ifscCode = "RBI0001";
        String ifscCode = "SBI0001";
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("IFSC Code: " + super.ifscCode);
    }
}


public class InstanceOfClass {
    
    public static void main(String[] args) {
        SBI sbi = new SBI();
        System.out.println(sbi instanceof SBI);
        System.out.println(sbi instanceof RBI);
        System.out.println(sbi.ifscCode);
    }
}
