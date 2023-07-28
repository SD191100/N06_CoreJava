package org.tns.encapsulation;

public class SBIExecutor {
    public static void main(String[] args) {
        SBI sbi = new SBI();

        // using setter methods
        sbi.setAccNo(987654321);
        sbi.setAccType("Savings");
        sbi.setAtmCardNo(1234567890);
        sbi.setPin(1234);
        
        System.out.println("Displaying all details using getter methods");
        System.out.println("Account number: " + sbi.getAccNo());
        System.out.println("Account type: " + sbi.getAccType());
        System.out.println("ATM card number: " + sbi.getAtmCardNo());
        System.out.println("PIN: " + sbi.getPin());

        // System.out.println("Displaying all details using display() method");
        // sbi.display();

        System.out.println("Displaying all details using toString() method");
        System.out.println(sbi);

    }
}
