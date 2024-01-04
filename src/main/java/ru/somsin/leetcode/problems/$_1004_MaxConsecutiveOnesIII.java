package ru.somsin.leetcode.problems;

public class $_1004_MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int result = 0, counter = 0;

        for (int left = 0, right = 0; right < nums.length; right++) {
            counter += nums[right] == 0 ? 0 : 1;

            if (right - left + 1 - counter > k) {
                counter -= nums[left++] == 0 ? 0 : 1;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
