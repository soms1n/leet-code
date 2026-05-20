package ru.somsin.leetcode.problems;

public class $_643_MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int window = 0;

        for (int left = 0, right = 0; right < nums.length; right++) {
            window += nums[right];

            if (right - left + 1 == k) {
                max = Math.max(max, window);
            }

            if (right >= k - 1) {
                window -= nums[left++];
            }
        }

        return (double) max / k;
    }
}
