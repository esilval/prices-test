package com.hackerrank.prices.external;

public class Histogram {

    static int myArray[] = new int[]{1, 2, 1, 3, 3, 1, 2, 1, 5, 1};

    public static void main(String args[]) {
        int n = myArray.length;
        boolean visited[] = new boolean[n];
        String output = "";
        for (int i = 1; i <= 5; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (visited[j]) {
                    continue;
                }
                if (myArray[j] == i) {
                    visited[j] = true;
                    count++;
                }
            }
            output = i + ": ";
            for (int k = 0; k < count; k++) {
                output = output + "*";
            }
            System.out.println(output);
        }
    }
}
