package com.hackerrank.prices.external;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Phrase {

    public static void main(String[] args) {
        Phrase phrase = new Phrase();
        System.out.println(phrase.constructCorrectPhrase("atse esarf eneit sal sarbalap la séver"));
    }

    private String constructCorrectPhrase(final String reversePhrase) {
        String[] arrStr = reversePhrase.split(" ");
        if (arrStr.length > 0) {
            return Arrays.stream(arrStr).map(this::reverseString).collect(Collectors.joining(" "));
        }
        return "";
    }

    private String reverseString(final String str) {
        byte[] arrByte = str.getBytes();
        byte[] result = new byte[arrByte.length];
        for (int i = 0; i < arrByte.length; i++) {
            result[i] = arrByte[arrByte.length - i - 1];
        }
        return new String(result);
    }
}
