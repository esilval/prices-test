package com.hackerrank.prices.external;

import java.util.Arrays;
import java.util.Random;

public class RandomArrays {

    private static final Integer ARR_SIZE = 20;

    public static void main(String[] args) {
        getSumOfArrays();
    }

    private static void getSumOfArrays() {
        int[] randomArray = new int[ARR_SIZE];
        final Random random = new Random();
        int upperBound = 100, temp = 0, maxSum = 0, minSum = 0;

        for (int i = 0; i < ARR_SIZE; i++) {
            randomArray[i] = random.nextInt(upperBound);
        }
        System.out.println("Unordered array: " + Arrays.toString(randomArray));

        for (int i = 0; i < ARR_SIZE - 1; i++) {
            for (int j = 0; j < ARR_SIZE - i - 1; j++) {
                if (randomArray[j] < randomArray[j + 1]) {
                    temp = randomArray[j];
                    randomArray[j] = randomArray[j + 1];
                    randomArray[j + 1] = temp;
                }
            }
        }
        System.out.println("Ordered array: " + Arrays.toString(randomArray));

        for (int i = 0; i < ARR_SIZE; i++) {
            if (i < (ARR_SIZE / 2) - 1) {
                minSum += randomArray[i];
            } else {
                maxSum += randomArray[i];
            }
        }

        System.out.println("Maximum sum (first half): " + minSum);
        System.out.println("Minimum sum (second half): " + maxSum);
    }
}
