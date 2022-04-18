package com.hackerrank.prices.external;

public class SimpleMaxDifference {

    public static void main(String[] args) {
        int[] A = {2, 7, 9, 5, 1, 3, 5};

        int diff = getMaxDiff(A);
        if (diff != -1) {
            System.out.print("The maximum difference is " + diff);
        }
    }

    public static int getMaxDiff(int[] A) {
        int diff = -1;

        int n = A.length;
        if (n == 0) {
            return diff;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[j] > A[i]) {
                    diff = Integer.max(diff, A[j] - A[i]);
                }
            }
        }

        return diff;
    }
}
