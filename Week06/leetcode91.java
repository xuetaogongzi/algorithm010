package com.wjw.leetcode;

/**
 * decode-ways
 * 解码方法
 */
public class leetcode91 {

    public int numDecodings(String s) {
        if (s == null || s.length() == 0) return 0;

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;
        for (int i = 2; i <= n; i++) {
            int first = Integer.valueOf(s.substring(i - 1, i));
            int second = Integer.valueOf(s.substring(i - 2, i));
            if (first >= 1 && first <= 9) {
                dp[i] += dp[i - 1];
            }
            if (second >= 10 && second <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }

    public int numDecodings1(String s) {
        if (s.charAt(0) == '0') return 0;

        int[] dp = new int[s.length()];
        dp[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                dp[i] = dp[i - 1];
            }
            int second = (s.charAt(i - 1) - '0') * 10 + s.charAt(i) - '0';
            if (second >= 10 && second <= 26) {
                if (i == 1) {
                    dp[i] = dp[i] + 1;
                } else {
                    dp[i] = dp[i] + dp[i - 2];
                }
            }
        }
        return dp[s.length() - 1];
    }
}
