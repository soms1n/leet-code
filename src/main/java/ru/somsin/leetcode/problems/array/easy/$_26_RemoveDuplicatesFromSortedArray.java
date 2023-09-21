package ru.somsin.leetcode.problems.array.easy;

public class $_26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int left = 1, prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prev) {
                nums[left++] = nums[i];
                prev = nums[i];
            }
        }

        return left;
    }
}
