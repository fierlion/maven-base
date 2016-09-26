package com.fierlion.getargs;

import java.lang.Boolean;
import java.lang.Integer;

public class Decpal {
    public static Boolean isPalindrome(Integer dec, int numLen) {
        int[] reversed = new int[numLen];
        System.out.println(dec);
        System.out.println(reversed.length);
        for (int i=0; i<numLen; i++) {
            int modulo = (i==0) ? 1 : (i**10);
            System.out.println(String.format("%d", modulo));
        }
        return true;
    }
}
