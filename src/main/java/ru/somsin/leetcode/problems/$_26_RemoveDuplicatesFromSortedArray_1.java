package ru.somsin.leetcode.problems;

public class $_26_RemoveDuplicatesFromSortedArray_1 {
    public int removeDuplicates(int[] nums) {
        int offset = 0;

        for (int left = 0, right = 0; right < nums.length; right++) {
            if (nums[left] == nums[right]) {
                offset++;
            } else {
                nums[++left] = nums[right];
            }
        }

        return nums.length - (offset - 1);
    }
}
