package ru.somsin.leetcode.problems.array.easy;

public class $_1470_ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        for (int i = 0, j = 0; j < n; i++, j++) {
            result[i++] = nums[j];
            result[i] = nums[j + n];
        }

        return result;
    }
}
