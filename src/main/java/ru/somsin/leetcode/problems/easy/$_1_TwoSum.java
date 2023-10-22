package ru.somsin.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class $_1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer index = numbers.get(target - nums[i]);
            if (index != null) {
                return new int[]{index, i};
            }
            numbers.put(nums[i], i);
        }

        return null;
    }
}
