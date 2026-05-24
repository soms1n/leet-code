package ru.somsin.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class $_1_TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            int value = target - nums[index];
            if (map.containsKey(value)) {
                return new int[] {index, map.get(value)};
            }
            map.put(nums[index], index);
        }
        return new int[] {};
    }
}
