// Darshan is very much interested in gardening and he decides to plant more trees in his garden. He plants trees in a rectangular fashion with the order of rows and columns and numbers the trees in row-wise order. he planted the mango tree in the first row, first column and last column. So given the tree number and row and column number, your task is to find out whether the given tree is a mango tree or not. If it is a mango tree, print "It is a mango tree", else print "It is not a mango tree". 
package org.tns.mangotree;

public class MangoTree {

    static void isMango(int n, int t){
        if (t % n == 0 || t % n == 1 || t <= n){
            System.out.println("It is a Mango Tree");
        }
        else {
            System.out.println("It is not a Mango Tree");
        }
    }
    
    public static void main(String[] args) {
        int t = 12;
        int n = 5;
        isMango(n, t);
    }
}
