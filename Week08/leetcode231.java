package com.wjw.leetcode;

/**
 * power-of-two
 * 2的幂
 */
public class leetcode231 {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        while (n > 0) {
            if (n == 1) return true;
            if (n % 2 != 0) return false;
            n >>= 1;
        }
        return false;
    }

    public boolean isPowerOfTwo1(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
