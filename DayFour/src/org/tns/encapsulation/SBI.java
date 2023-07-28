package org.tns.encapsulation;
//Encapsulation is a process of wrapping code and data together into a single unit. used to hide the values or state of a structured data object inside a class, preventing unauthorized parties' direct access to them. Achieved using access modifiers.
public class SBI {
    private String accType;
    private long accNo;
    private long atmCardNo;
    private int pin;

    // public SBI(String accType, long accNo, long atmCardNo, int pin) {
    //     this.accType = accType;
    //     this.accNo = accNo;
    //     this.atmCardNo = atmCardNo;
    //     this.pin = pin;
    // }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        if (accType.equals("Savings") || accType.equals("Current")) {
            this.accType = accType;
        } else {
            System.out.println("Invalid account type");
        }
    }

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        if (accNo > 0) {
            this.accNo = accNo;
        } else {
            System.out.println("Invalid account number");
        }
    }

    public long getAtmCardNo() {
        return atmCardNo;
    }

    public void setAtmCardNo(long atmCardNo) {
        if (atmCardNo > 0) {
            this.atmCardNo = atmCardNo;
        } else {
            System.out.println("Invalid ATM card number");
        }
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        if (pin > 0) {
            this.pin = pin;
        } else {
            System.out.println("Invalid PIN");
        }
    }

    public void display() {
        System.out.println("Account type: " + accType);
        System.out.println("Account number: " + accNo);
        System.out.println("ATM card number: " + atmCardNo);
        System.out.println("PIN: " + pin);


    }

    public String toString(){
        return "SBI DETAILS\nAccount type: " + accType + "\nAccount number: " + accNo + "\nATM card number: " + atmCardNo + "\nPIN: " + pin;
    }
}
