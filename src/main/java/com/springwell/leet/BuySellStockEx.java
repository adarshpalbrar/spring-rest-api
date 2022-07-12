package com.springwell.leet;

public class BuySellStockEx {

    public static void main(String[] args) {

        // 7, 1, 5, 3, 6, 4
        int [] stocks = {7, 1, 5, 3, 6, 4};
        int maxProfit = 0;
        int left = 0;
        int totalProfit = 0;

        for (int right = 0; right < stocks.length; right++) {
            if (stocks[right] > stocks[left]) {
                maxProfit = Math.max(maxProfit, stocks[right] - stocks[left]);
            } else {
                left=right;
            }
        }
        System.out.println(maxProfit);

        for (int i = 1; i < stocks.length; i++) {
            if (stocks[i] > stocks[i - 1]) {
                int profit = stocks[i] - stocks[i - 1];
                totalProfit+=profit;
            }
        }

        System.out.println(totalProfit);
    }
}
