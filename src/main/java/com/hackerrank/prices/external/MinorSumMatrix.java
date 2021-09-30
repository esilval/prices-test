package com.hackerrank.prices.external;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MinorSumMatrix {

    static int[] myArray = {1, 2, 9, 2, 5, 3, 5, 1, 5};

    public static void main(String[] args) {
        int rows = 3, cols = 3;
        int x = 0;
        int minor = 9;
        int[] path = new int[3];
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = myArray[x];
                x++;
            }
        }
        int control = 0;
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (matrix[j][i] < minor) {
                    minor = matrix[j][i];
                    path[i] = minor;
                } else if (control + 1 == j) {
                    minor = matrix[j][i];
                    path[i] = minor;
                } else if (control - 1 == j) {
                    minor = matrix[j][i];
                    path[i] = minor;
                }
            }
            minor = 9;
        }
        Arrays.sort(path);
        String output = Arrays.stream(path).mapToObj(p -> p + "").collect(Collectors.joining(" "));
        System.out.println(output);
    }
}
