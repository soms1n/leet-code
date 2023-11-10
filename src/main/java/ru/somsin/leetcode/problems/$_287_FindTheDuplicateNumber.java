package ru.somsin.leetcode.problems;

public class $_287_FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        for (int num : nums) {
            int position = Math.abs(num) - 1;

            if (nums[position] < 0) {
                return position + 1;
            }

            nums[position] *= -1;
        }

        return 0;
    }
}
