package com.hackerrank.prices.external;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grades {

    static List<Integer> myGrades = Arrays.asList(73, 67, 38, 33);

    public static void main(String[] args) {
        final List<Integer> roundedGrades = gradingList(myGrades);
        for (int i = 0; i < roundedGrades.size(); i++) {
            System.out.println(roundedGrades.get(i));
        }
    }

    public static List<Integer> gradingList(List<Integer> grades) {
        int size = grades.size();
        List<Integer> roundedGrades = new ArrayList<>(size);
        for (int i = 0; i < grades.size(); i++) {
            int actual = grades.get(i);
            Double nextMultiple = Math.ceil(actual / 5 + 1) * 5;
            if (actual < 38 || Math.abs(nextMultiple - actual) >= 3) {
                roundedGrades.add(actual);
            } else {
                roundedGrades.add(nextMultiple.intValue());
            }
        }
        return roundedGrades;
    }
}
