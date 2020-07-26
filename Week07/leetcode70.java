package com.wjw.leetcode;

/**
 * climbing-stairs
 * 爬楼梯
 */
public class leetcode70 {

    public int climbStairs(int n) {
        if (n <= 3) return n;
        int firstStep = 2, secondStep = 3, sum = 0;
        while (n-- > 3) {
            sum = firstStep + secondStep;
            firstStep = secondStep;
            secondStep = sum;
        }
        return sum;
    }
}
