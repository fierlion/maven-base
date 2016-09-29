package com.fierlion.getargs;

import java.util.List;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayMult {
    public static Integer multiplyArrays(List<Integer> first, List<Integer> second) {
        //what happens with negative?
        Integer result = 0;
        //is it possible to use a primitive list? 
        //length n + m n=first.length, m=second.length
        List<Integer> results = new ArrayList<>();
        Integer carry = 0;
        for (int i = first.size()-1; i >= 0; i--) {
            for (int j = second.size()-1; j >= 0; j--) {
                System.out.println(String.format("%d, %d", first.get(i), second.get(j)));
                //multiply, store the carry int 
                Integer thisResult = first.get(i) * second.get(j);
                results.add(thisResult % 10);
                carry = thisResult / 10;
                System.out.print(thisResult);
                System.out.print(" ");
                System.out.print(results);
                System.out.print(" ");
                System.out.println(carry);
            }
            results.clear();
            carry = 0;
        }
        return result;
    }
}
