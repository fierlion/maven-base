package com.fierlion.getargs;

import java.util.List;
import java.lang.Integer;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        first.add(5);
        second.add(4);
        second.add(1);
        ArrayMult ar = new ArrayMult();
        ar.multiplyArrays(first,second);
    }
}

