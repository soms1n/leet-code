package ru.somsin.leetcode.problems;

public class $_1493_LongestSubarrayOf1SAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int result = 0, counter = 0, counterZero = 0;

        for (int left = 0, right = 0; right < nums.length; right++) {
            counterZero += nums[right] == 0 ? 1 : 0;
            counter += nums[right] == 0 ? 0 : 1;

            if (right - left + 1 - counter > 1) {
                counter -= nums[left++] == 0 ? 0 : 1;
            }

            result = Math.max(result, right - left);
        }

        return counterZero == 0 ? nums.length - 1 : counterZero == nums.length ? 0 : result;
    }
}
