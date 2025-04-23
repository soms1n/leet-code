package ru.somsin.leetcode.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class $_2465_NumberOfDistinctAverages {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        Set<Double> avg = new HashSet<>();

        for (int left = 0, right = nums.length - 1; left < right; left++, right--) {
            avg.add((double) (nums[left] + nums[right]) / 2);
        }

        return avg.size();
    }
}
