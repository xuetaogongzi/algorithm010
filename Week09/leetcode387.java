package com.wjw.leetcode;

/**
 * first-unique-character-in-a-string
 * 字符串中的第一个唯一字符
 */
public class leetcode387 {

    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }

        int min = s.length();
        for (int i = 'a'; i <= 'z'; i++) {
            int first = s.indexOf(i);
            if (first == -1) continue;
            if (first == s.lastIndexOf(i) && min > first) {
                min = first;
            }
        }
        return min == s.length() ? -1 : min;
    }
}
