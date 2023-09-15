package ru.somsin.leetcode.problems.array.easy;

public class $_2367_NumberOfArithmeticTriplets {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n = nums.length, counter = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[k] - nums[j] == diff && nums[j] - nums[i] == diff) {
                        counter++;
                    }
                }
            }
        }

        return counter;
    }
}
