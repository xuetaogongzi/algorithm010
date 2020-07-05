package com.wangjw.awake.algorithm.trainingCamp.week4;

/**
 * best-time-to-buy-and-sell-stock-ii
 * 买卖股票的最佳时机 II
 */
public class leetcode122 {

    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }

        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
}
