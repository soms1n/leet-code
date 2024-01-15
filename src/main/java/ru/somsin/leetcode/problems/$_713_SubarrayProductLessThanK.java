package ru.somsin.leetcode.problems;

public class $_713_SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int result = 0;

        for (int left = 0; left < nums.length; left++) {
            if (nums[left] >= k) {
                continue;
            }

            result++;

            int product = nums[left];

            for (int right = left + 1; right < nums.length; right++) {
                product *= nums[right];

                if (product >= k) {
                    break;
                }

                result++;
            }
        }

        return result;
    }
}
