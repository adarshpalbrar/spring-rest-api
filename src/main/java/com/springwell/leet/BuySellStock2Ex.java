package com.springwell.leet;

public class BuySellStock2Ex {

    public static void main(String[] args) {

        int[] stocks = {7, 1, 5, 3, 6, 4};
        int profit = 0;

        for (int i = 1; i < stocks.length; i++) {
            if (stocks[i] > stocks[i-1]) {
                profit = profit + (stocks[i] - stocks[i-1]);
            }
        }
        System.out.println(profit);
    }
}
