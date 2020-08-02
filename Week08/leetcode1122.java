package com.wjw.leetcode;

import java.util.Arrays;

/**
 * relative-sort-array
 * 数组的相对排序
 */
public class leetcode1122 {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    res[k++] = arr1[j];
                    arr1[j] = -1;
                }
            }
        }

        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) {
                res[k++] = arr1[i];
            }
        }
        return res;
    }

    public int[] relativeSortArray1(int[] arr1, int[] arr2) {
        int k = 0, nums[] = new int[1001], res[] = new int[arr1.length];
        for (int i : arr1) nums[i]++;
        for (int j : arr2) while (nums[j]-- > 0) res[k++] = j;
        for (int q = 0; q < nums.length; q++) while (nums[q]-- > 0) res[k++] = q;
        return res;
    }
}
