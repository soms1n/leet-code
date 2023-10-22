package ru.somsin.leetcode.problems.easy;

public class $_961_NRepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] nums) {
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] || nums[i] == nums[i - 2]) {
                return nums[i];
            }
        }

        return nums[0];
    }
}
