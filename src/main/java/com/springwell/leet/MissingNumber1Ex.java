package com.springwell.leet;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumber1Ex {

    public static void main(String[] args) {

        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};

        for (int i = 0; i < array.length; i++) {
            int index = Math.abs(array[i]) - 1;
            if (array[index] > 0) {
                array[index] *= -1;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) list.add(i+1);
        }
        System.out.println(list);
    }
}
