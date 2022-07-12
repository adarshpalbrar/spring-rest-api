package com.springwell.leet;

import java.util.Arrays;
import java.util.List;

public class MissingNumberEx {

    public static void main(String[] args) {

        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] retVal = new int[array.length + 1];
        for (int num : array) {
            retVal[num] = num;
        }
        System.out.println(Arrays.toString(retVal));

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer reduce = integers.stream().reduce(0, Integer::sum);
        System.out.println("Sum: "+ reduce);

        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> b = Arrays.asList(1, 2, 3, 4, 5);

        int alice = 0;
        int bob = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alice++;
            } else if (a.get(i) < b.get(i)) {
                bob++;
            }
        }
        List<Integer> ans = Arrays.asList(alice, bob);
        System.out.println(ans);
    }
}
