package com.hackerrank.prices.external;

public class LargestSum {

    static final int[] myArray = new int[] {-2,1,-3,4,-1,2,1,-5,4};

    public static void main(String[] args) {
        LargestSum largestSum = new LargestSum();
        System.out.println(largestSum.maxSubArraySum(myArray, myArray.length));
    }

    public String maxSubArraySum(int[] array, int size) {
        String output = "[";
        int max = array[0];
        int ending = 0;

        for (int i = 0; i < size; i++) {
            ending = ending + array[i];
            if (ending < 0) {
                ending = 0;
            } else if (max < ending) {
                output = output + array[i] + ",";
                max = ending;
            }
        }
        StringBuilder sb = new StringBuilder(output);
        sb.deleteCharAt(output.lastIndexOf(","));
        output = sb + "] has the largest sum = " + max;
        return output;
    }
}
