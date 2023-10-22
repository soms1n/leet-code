package ru.somsin.leetcode.problems.easy;

public class $_1470_ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int length = nums.length;

        for (int i = n; i < length; i++) {
            nums[i] = nums[i] * 1024 + nums[i - n];
        }

        for (int i = 0, j = n; j < length; i += 2, j++) {
            nums[i] = nums[j] % 1024;
            nums[i + 1] = nums[j] / 1024;
        }

        return nums;
    }
}
