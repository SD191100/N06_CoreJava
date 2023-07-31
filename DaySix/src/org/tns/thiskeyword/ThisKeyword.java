package org.tns.thiskeyword;

class Account {
    long accountNumber;

    void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    void display() {
        // this.accountNumber = accountNumber;
        System.out.println("Account Number: " + accountNumber);
    }
}


public class ThisKeyword {
    public static void main(String[] args) {
        Account a = new Account();
        a.setAccountNumber(12345678);
        a.display();
    }
}
