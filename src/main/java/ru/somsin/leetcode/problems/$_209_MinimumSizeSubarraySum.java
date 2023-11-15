package ru.somsin.leetcode.problems;

import java.util.Arrays;

public class $_209_MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        Arrays.sort(nums);

        int sum = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];

            if (sum >= target) {
                return nums.length - i;
            }
        }

        return sum >= target ? 1 : 0;
    }
}
