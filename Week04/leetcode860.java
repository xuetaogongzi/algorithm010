package com.wangjw.awake.algorithm.trainingCamp.week4;

import java.util.HashMap;
import java.util.Map;

/**
 * lemonade-change
 * 柠檬水找零
 */
public class leetcode860 {

    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                map.put(5, map.getOrDefault(5, 0) + 1);
            } else if (bills[i] == 10) {
                if (!map.containsKey(5) || map.get(5) < 1) {
                    return false;
                } else {
                    map.put(10, map.getOrDefault(10, 0) + 1);
                    map.put(5, map.get(5) - 1);
                }
            } else {
                if (map.containsKey(10) && map.containsKey(5) && map.get(10) >= 1 && map.get(5) >= 1) {
                    map.put(10, map.get(10) - 1);
                    map.put(5, map.get(5) - 1);
                } else if (map.containsKey(5) && map.get(5) >= 3) {
                    map.put(5, map.get(5) - 3);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
