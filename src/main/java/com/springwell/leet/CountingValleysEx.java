package com.springwell.leet;

public class CountingValleysEx {

    public static void main(String[] args) {

        String input = "DUDDUUUUDDD";
        int altitude = 0;
        int numValleys = 0;
        for (int i = 0; i < input.toCharArray().length; i++) {
            char charAt = input.charAt(i);
            if (charAt == 'D') {
                altitude = altitude - 1;
            }
            if (charAt == 'U') {
                altitude = altitude + 1;
            }
            if (altitude == 0 & charAt == 'U') {
                numValleys++;
            }
        }

        System.out.println(numValleys);
    }
}
