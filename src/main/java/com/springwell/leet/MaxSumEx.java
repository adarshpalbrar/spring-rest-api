package com.springwell.leet;

import java.util.Arrays;

public class MaxSumEx {

    public static void main(String[] args) {

        int [] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // [5,4,-1,7,8] -> c=5, m=5
        // 4, 9 -> c=9, m=9
        // 9, 8 -> c=9, m=9

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            array[i] = Math.max(array[i], array[i] + array[i - 1]);
            max = Math.max(array[i], max);
        }
        System.out.println(max);
        System.out.println(Arrays.toString(array));
    }
}
