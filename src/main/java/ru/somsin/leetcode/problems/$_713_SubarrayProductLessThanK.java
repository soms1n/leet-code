package ru.somsin.leetcode.problems;

public class $_713_SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int result = 0, product = 1;

        for (int left = 0, right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (product >= k && left <= right) {
                product /= nums[left++];
            }

            result += right - left + 1;
        }

        return result;
    }
}
