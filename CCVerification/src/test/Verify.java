package test;

import java.util.*;

import java.io.*;


public class Verify {


    public static void main(String[] args) {

        String card = "5204408086566492";

        int[] cc = new int[card.length()];

        for (int i = 0; i < card.length(); i++) {
            cc[i] = Character.getNumericValue(card.charAt(i));
        }

        int sumEven = sumOfEvenNumber(card.length() - 1, cc);
        int sumOdd = sumOfOddNumber(card.length() - 1, cc);

        if ((sumEven + sumOdd) % 10 == 0) {
            System.out.println("CC Valid");
        } else {
            System.out.println("CC Invalid");
        }

    }

    private static int sumOfEvenNumber(int length, int[] cc) {
        int sumEven = 0;
        for (int j = length - 1; j >= 0; j -= 2) {
            cc[j] = cc[j] * 2;
            if (cc[j] >= 10) {
                cc[j] = cc[j] - 9;
            }
            sumEven += cc[j];
        }
        return sumEven;
    }

    private static int sumOfOddNumber(int length, int[] cc) {
        int sumOdd = 0;
        for (int i = length; i >= 0; i -= 2) {
            sumOdd += cc[i];

        }
        return sumOdd;
    }
}
