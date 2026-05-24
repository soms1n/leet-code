package ru.somsin.leetcode.problems;

public class $_209_MinimumSizeSubarraySum_1 {
    public int minSubArrayLen(int target, int[] nums) {
        int window = 0, result = Integer.MAX_VALUE;
        for (int left = 0, right = 0; right < nums.length; right++) {
            window += nums[right];
            while (window >= target) {
                result = Math.min(result, right - left + 1);
                window -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
