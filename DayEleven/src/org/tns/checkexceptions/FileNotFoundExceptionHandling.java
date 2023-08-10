package org.tns.checkexceptions;

import java.io.FileInputStream;

public class FileNotFoundExceptionHandling {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("/home/tanjiro/code/java/N_06_TNS/DayEleven/src/org/tns/checkexceptions/b.txt");
            System.out.println("File Exist");
        } catch (Exception e) {
            System.out.println("Exception handled: " + e );
        }
    }
}
