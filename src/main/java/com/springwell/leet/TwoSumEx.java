package com.springwell.leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumEx {

    public static void main(String[] args) {

        int [] nums = {2, 1, 3, 5, 8};
        int target = 9;
        Map<Integer, Integer> integerMap = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (integerMap.containsKey(target - nums[i])) {
                ans[0] = integerMap.get(target - nums[i]);
                ans[1] = i;
            } else {
                integerMap.put(nums[i], i);
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
