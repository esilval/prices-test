package com.hackerrank.prices.external;

import java.util.Arrays;
import java.util.List;

public class MinMaxSum {

    public static void main(String[] args) {
        minMaxSum(Arrays.asList(1, 3, 5, 7, 9));
    }

    private static void minMaxSum(List<Integer> arr) {
        int max = arr.get(0), min = arr.get(0);
        long total = 0;

        for (Integer n : arr) {
            total += n;
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        System.out.println((total - max) + " " + (total - min));
    }
}
