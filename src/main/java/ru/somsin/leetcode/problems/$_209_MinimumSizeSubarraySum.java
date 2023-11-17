package ru.somsin.leetcode.problems;

public class $_209_MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0, min = Integer.MAX_VALUE, sum = 0;

        while (j < nums.length) {
            sum += nums[j++];

            while (sum >= target) {
                min = Math.min(min, j - i);
                sum -= nums[i++];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
