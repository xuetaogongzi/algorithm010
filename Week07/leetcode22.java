package com.wjw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * generate-parentheses
 * 括号生成
 */
public class leetcode22 {

    private List<String> result = new ArrayList<String>();

    public List<String> generateParenthesis(int n) {
        generate(0, 0, n, "");
        return result;
    }

    private void generate(int left, int right, int n, String s) {
        if (left == n && right == n) {
            result.add(s);
            return;
        }

        if (left < n) {
            generate(left + 1, right, n, s + "(");
        }

        if (right < left) {
            generate(left, right + 1, n, s + ")");
        }
    }
}
