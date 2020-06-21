package com.wangjw.awake.algorithm.trainingCamp.week2;

import java.util.Arrays;

/**
 * valid-anagram
 * 有效的字母异位词
 */
public class leetcode242 {

    // 排序比较
    /*public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] s1 = s.toCharArray();
        Arrays.sort(s1);

        char[] t1 = t.toCharArray();
        Arrays.sort(t1);

        return Arrays.equals(s1, t1);
    }*/

    // 字母字典
    /*public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (int i : arr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }*/

    // 字母字典
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
            if (arr[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
