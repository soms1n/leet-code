package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class $_300_LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int value = Integer.MIN_VALUE;

            List<Integer> subsequence = new ArrayList<>();

            for (int j = i; j < nums.length; j++) {
                if (nums[j] > value) {
                    value = nums[j];
                    subsequence.add(value);
                }
            }

            if (!subsequence.isEmpty()) {
                list.add(subsequence);
            }
        }

        int result = 0;

        for (List<Integer> subsequence : list) {
            result = Math.max(subsequence.size(), result);
        }

        return result;
    }
}
