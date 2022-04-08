package com.hackerrank.prices.external;

public class MaximumValueArray {

    static int[] myArray = new int[] {13, 2, 4, 35, 1};

    public static void main(String[] args) {
        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (max < myArray[i]) {
                max = myArray[i];
            }
        }
        System.out.println(max);
    }
}
