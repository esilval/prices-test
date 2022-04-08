package com.hackerrank.prices.external;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {
        List<Integer> row1 = Arrays.asList(1, 2, 3);
        List<Integer> row2 = Arrays.asList(4, 5, 6);
        List<Integer> row3 = Arrays.asList(7, 8, 9);

        List<List<Integer>> rows = Arrays.asList(row1, row2, row3);
        System.out.println(diagonalDifference(rows));

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int firstDiagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
            firstDiagonal += arr.get(i).get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            secondDiagonal += arr.get(i).get(arr.size() - (i + 1));
        }

        return Math.abs(firstDiagonal - secondDiagonal);
    }
}
