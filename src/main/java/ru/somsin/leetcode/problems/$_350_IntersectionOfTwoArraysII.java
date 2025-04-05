package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $_350_IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> counter1 = new HashMap<>();

        for (int num : nums1) {
            counter1.put(num, counter1.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> counter2 = new HashMap<>();

        for (int num : nums2) {
            counter2.put(num, counter2.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for (int num : counter1.keySet()) {
            if (counter2.containsKey(num)) {
                int counter = Math.min(counter1.get(num), counter2.get(num));

                for (int i = 0; i < counter; i++) {
                    result.add(num);
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
