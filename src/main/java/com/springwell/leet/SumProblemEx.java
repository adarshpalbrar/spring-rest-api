package com.springwell.leet;

import java.util.*;
import java.util.stream.Collectors;

public class SumProblemEx {

    public static void main(String[] args) {

        int[] i1 = {7, 4, 1, 10};
        int[] i2 = {4, 5, 8, 7};
        int target = 9;

        Set<Integer> integerSet = Arrays.stream(i1)
                .boxed()
                .collect(Collectors.toSet());

        for (int i = i2.length - 1; i >= 0; i--) {
            int num = target - i2[i];
            if (integerSet.contains(num)) {
                System.out.println(i2[i] + " " + num);
            }
        }
    }
}
