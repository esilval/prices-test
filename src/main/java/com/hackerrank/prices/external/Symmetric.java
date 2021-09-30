package com.hackerrank.prices.external;

public class Symmetric {

    static String[] myArray = {"a", "b", "c", "d", "d", "c", "b", "a"};
    static int n = 8;

    public static void main(String args[]) {
        boolean symm = true;
        for (int i = 0; i < n; i++) {
            if (myArray[i] != myArray[n - 1 - i]) {
                symm = false;
            }
        }
        if (symm) {
            System.out.println("Symmetric");
        } else {
            System.out.println("Asymmetric");
        }
    }
}
