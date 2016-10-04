package com.fierlion.getargs;

import java.util.List;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Arrays;

public class ArrayMult {
    public static Integer multiplyArrays(List<Integer> first, List<Integer> second) {
        //what happens with negative?
        Integer result = 0;
        //is it possible to use a primitive list? 
        //length n + m n=first.length, m=second.length
        List<Integer> results = new ArrayList<>();
        Integer carry = 0;
        Integer times = 0;
        for (int i = first.size()-1; i >= 0; i--) {
            for (int j = second.size()-1; j >= 0; j--) {
                //multiply, store the carry int 
                Integer thisResult = first.get(i) * second.get(j) + carry;
                results.add(thisResult % 10);
                carry = thisResult / 10;
                times += 1;
            }
            System.out.print(results);
            System.out.print(" ");
            System.out.println(carry);
            result = results.stream().mapToInt(in -> in.intValue()).sum();
            System.out.println(result);
            results.clear();
            carry = 0;
        }
        return result;
    }
}
