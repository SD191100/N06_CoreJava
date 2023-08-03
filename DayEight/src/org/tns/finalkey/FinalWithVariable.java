package org.tns.finalkey;

public class FinalWithVariable {
    // final local vairable has to initialised;
    //FINAL int x;
    final float SALARY = 65000.0f;

    void print () {
        //We cannot modify value of final variable;
        //SALARY = 17000.89f;
        System.out.println("Salary is: " + SALARY);
    }

}
