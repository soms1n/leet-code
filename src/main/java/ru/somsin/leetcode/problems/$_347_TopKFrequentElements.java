package ru.somsin.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class $_347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();

        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        return counter.entrySet().stream()
                .sorted((o1, o2) -> {
                    int val = o1.getValue().compareTo(o2.getValue());

                    if (val > 0) {
                        return -1;
                    } else if (val < 0) {
                        return 1;
                    } else {
                        return val;
                    }
                })
                .limit(k)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
