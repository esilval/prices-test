package com.hackerrank.prices.external;

import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        birthdayCakeCandles(Arrays.asList(3, 2, 1, 3));
    }

    private static void birthdayCakeCandles(List<Integer> arr) {
        int highestValue = arr.get(0);
        int count = 0;
        for (Integer n : arr) {
            if (n > highestValue) {
                highestValue = n;
                count = 0;
            }
            if (n == highestValue) {
                count++;
            }
        }
        System.out.println(highestValue + " " + count);
    }
}
