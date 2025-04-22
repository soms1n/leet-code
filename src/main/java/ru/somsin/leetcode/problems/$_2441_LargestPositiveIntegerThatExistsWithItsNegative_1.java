package ru.somsin.leetcode.problems;

import java.util.Arrays;

public class $_2441_LargestPositiveIntegerThatExistsWithItsNegative_1 {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);

        int max = Integer.MIN_VALUE;

        for (int left = 0, right = nums.length - 1; left < right; ) {
            if (nums[left] + nums[right] == 0) {
                max = Math.max(max, nums[right]);
                left++;
                right--;
            } else if (nums[left] + nums[right] < 0) {
                left++;
            } else {
                right--;
            }
        }

        return max == Integer.MIN_VALUE ? -1 : max;
    }
}
