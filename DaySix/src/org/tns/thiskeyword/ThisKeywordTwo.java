package org.tns.thiskeyword;

class Bank {
    long accountNumber;

    // void setAccountNumber(long accountNumber) {
    //     this.accountNumber = accountNumber;
    // }

    Bank(long accountNumber){
        this.accountNumber = accountNumber;
        System.out.println("Account Number: " + accountNumber);
    }

    

    void display() {
        // this.accountNumber = accountNumber;
        System.out.println("Account Number: " + accountNumber);
    }
}

public class ThisKeywordTwo {

    public static void main(String[] args) {
        
        Bank b = new Bank(12345678);
        b.display();
    }
}
