package ru.somsin.leetcode.problems;

public class $_26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int writePointer = 1;

        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != nums[readPointer - 1]) {
                nums[writePointer++] = nums[readPointer];
            }
        }

        return writePointer;
    }
}
