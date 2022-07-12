package com.springwell.leet;

public class LastWordLengthEx {

    public static void main(String[] args) {

        String str = "Hello World";
        int right = str.length() - 1;
        int length = 0;

        if (str.charAt(right) !=  ' ') {

            while (right > 0 && str.charAt(right) != ' ') {
                length++;
                right--;
            }
        }
        System.out.println(length);
    }
}
