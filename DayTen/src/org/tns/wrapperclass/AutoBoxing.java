package org.tns.wrapperclass;

// it is conversion of primitive to objectType
public class AutoBoxing {
    public static void main(String[] args) {
        int num = 90;
        Integer val = num;
        System.out.println(num);
        // System.out.println(num.getClass().getName());
        System.out.println(val);
        System.out.println(val.getClass().getName());
    }

}
