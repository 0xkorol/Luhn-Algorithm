package test;

import java.util.*;

import java.io.*;


public class Verify {

    public static void main(String[] args) {

        String card = "5204408086566492";
        int k = card.length();
        int[] cc = new int[k];

        for (int i = 0; i < k; i++) {
            cc[i] = Character.getNumericValue(card.charAt(i));
        }

        System.out.println(k);

        for (int j = 0; j <= k-1; j = j + 2) {
            cc[j] = cc[j] * 2;
            if (cc[j] >= 10) {
                cc[j] = cc[j] - 9;

            }
        }
        int sum = 0;
        for (int x = 0; x < cc.length; x++) {
            sum += cc[x];
        }
        if (sum % 10 == 0) {
            System.out.println("CC Valid");
        } else {
            System.out.println("CC Invalid");
        }

    }
}
