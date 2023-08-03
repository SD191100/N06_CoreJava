package org.tns.finalkey;

public class FinalExecutor {
    public static void main(String[] args) {
        FinalWithVariable fv = new FinalWithVariable();
        // Cannot modify final variable;
        //fv.SALARY = 17000.89f;
        fv.print();
    }
}
