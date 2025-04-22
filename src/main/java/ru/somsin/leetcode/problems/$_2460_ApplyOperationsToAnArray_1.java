package ru.somsin.leetcode.problems;

public class $_2460_ApplyOperationsToAnArray_1 {
    public int[] applyOperations(int[] nums) {
        for (int i = 0, j = 0; i < nums.length; i++) {
            int value = nums[i];

            if (value == 0) {
                continue;
            }

            if (i + 1 < nums.length && value == nums[i + 1]) {
                value *= 2;
                nums[i + 1] = 0;
            }

            if (i != j) {
                nums[i] = 0;
            }

            nums[j++] = value;
        }

        return nums;
    }
}
