package com.fierlion.getargs;

import java.util.List;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        Integer[] firstNum = {3,5};
        Integer[] secondNum = {3,5};
        first.addAll(Arrays.asList(firstNum));
        second.addAll(Arrays.asList(secondNum));
        Integer result = ChapThree.multiplyArrays(first,second);
        System.out.println(String.format("Result is: %s", result));

        //_________
        List<Integer> third = new ArrayList<>();
        List<Integer> permutation = new ArrayList<>();
        Integer[] thirdNum = {0,1,2,3,4,5};
        Integer[] permute = {1,2,3,4,5,0};
        third.addAll(Arrays.asList(thirdNum));
        permutation.addAll(Arrays.asList(permute));
        List<Integer> result2 = ChapThree.permuteArray(third, permutation);
        System.out.print("Result2 is: ");
        System.out.println(result2);
    }
}

