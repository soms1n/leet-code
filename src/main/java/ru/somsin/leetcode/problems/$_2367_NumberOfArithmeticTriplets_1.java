package ru.somsin.leetcode.problems;

public class $_2367_NumberOfArithmeticTriplets_1 {
    public int arithmeticTriplets(int[] nums, int diff) {
        int result = 0;

        for (int i = 0; i <= nums.length - 3; i++) {
            int value = nums[i] + diff;

            for (int j = i + 1; j <= nums.length - 2; j++) {
                if (nums[j] == value) {
                    value += diff;

                    for (int k = j + 1; k <= nums.length - 1; k++) {
                        if (nums[k] == value) {
                            result++;
                            break;
                        }
                    }

                    break;
                } else if (nums[j] > value) {
                    break;
                }
            }
        }

        return result;
    }
}
