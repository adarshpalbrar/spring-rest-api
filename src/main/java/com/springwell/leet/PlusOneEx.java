package com.springwell.leet;

import java.util.Arrays;

public class PlusOneEx {

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int currSum = digits[i] + carry;
            if (currSum >= 10) {
                carry = 1;
                digits[i] = 0;
            } else {
                digits[i] = currSum;
                carry = 0;
            }
        }
        if (carry == 1) {
            int [] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            System.out.println(Arrays.toString(newDigits));
        } else {
            System.out.println(Arrays.toString(digits));
        }
    }
}
