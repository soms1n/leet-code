package ru.somsin.leetcode.problems.array.easy;

import java.util.HashMap;
import java.util.Map;

public class $_1512_NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        int result = 0;

        for (int num : nums) {
            int numCounter = counter.getOrDefault(num, 0);
            result += numCounter;
            counter.put(num, numCounter + 1);
        }

        return result;
    }
}
