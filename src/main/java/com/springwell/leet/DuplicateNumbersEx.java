package com.springwell.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateNumbersEx {

    public static void main(String[] args) {

        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int index = Math.abs(array[i]) - 1;

            if(array[index] > 0) {
                array[index] = -1 * array[index];
            } else {
                integers.add(index + 1);
            }
        }
        System.out.println(integers);

        System.out.println(Arrays.toString(array));
    }
}
