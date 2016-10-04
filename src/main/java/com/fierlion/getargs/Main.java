package com.fierlion.getargs;

import java.util.List;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        Integer[] firstNum = {5,6,7};
        Integer[] secondNum = {1,2};
        first.addAll(Arrays.asList(firstNum));
        second.addAll(Arrays.asList(secondNum));
        ArrayMult ar = new ArrayMult();
        Integer result = ar.multiplyArrays(first,second);
        System.out.println(String.format("Result is: %s", result));
    }
}

