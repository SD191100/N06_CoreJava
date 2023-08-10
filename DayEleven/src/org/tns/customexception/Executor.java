package org.tns.customexception;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) throws Login {
        System.out.println();
        Scanner s = new Scanner(System.in);
        String id = s.nextLine();
        String pass = s.nextLine();

        try {
            if (id.equals("abc@gmail") && pass.equals("1234")) {
                System.out.println("Login Sucessfull");
            } else {

                s.close();
                throw new Login("Invalid ID or Pass");
            }
        } catch (Login e) {

            System.out.println("Exception handled: " + e);
        }

        System.out.println();
    }
}
