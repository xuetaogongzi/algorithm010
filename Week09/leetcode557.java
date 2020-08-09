package com.wjw.leetcode;

/**
 * reverse-words-in-a-string-iii
 * 反转字符串中的单词 III
 */
public class leetcode557 {

    public String reverseWords(String s) {
        if (s == null || s.equals("") || s.equals(" ")) {
            return s;
        }

        String[] arr = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            char[] cs = arr[i].toCharArray();
            int left = 0, right = cs.length - 1;
            while (left < right) {
                char temp = cs[left];
                cs[left] = cs[right];
                cs[right] = temp;
                left++;
                right--;
            }

            builder.append(String.valueOf(cs));
            if (i != arr.length - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }

    public String reverseWords1(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            res.append(new StringBuffer(word).reverse().toString() + " ");
        }
        return res.toString().trim();
    }
}
