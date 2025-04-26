package ru.somsin.leetcode.problems;

public class $_2562_FindTheArrayConcatenationValue {
    public long findTheArrayConcVal(int[] nums) {
        long result = 0;

        for (int left = 0, right = nums.length - 1; left <= right; left++, right--) {
            if (left == right) {
                result += nums[left];
            } else {
                result += Long.parseLong("" + nums[left] + nums[right]);
            }
        }

        return result;
    }
}
