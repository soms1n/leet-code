package ru.somsin.leetcode.problems;

import java.util.Arrays;

public class $_16_3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int diff = Integer.MAX_VALUE, result = 0;

        for (int index = 0; index < nums.length; index++) {
            int left = index + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[index] + nums[left] + nums[right];
                if (Math.abs(target - sum) < diff) {
                    diff = Math.abs(target - sum);
                    result = sum;
                }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
