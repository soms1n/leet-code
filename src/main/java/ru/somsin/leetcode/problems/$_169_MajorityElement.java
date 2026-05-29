package ru.somsin.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class $_169_MajorityElement {
    public int majorityElement(int[] nums) {
        int majority = 0, max = 0;
        Map<Integer, Integer> counter = new HashMap<>();

        for (int num : nums) {
            Integer count = counter.getOrDefault(num, 0);
            counter.put(num, ++count);

            if (count > max) {
                max = count;
                majority = num;
            }
        }

        return majority;
    }
}
