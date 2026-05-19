package ru.somsin.leetcode.problems;

public class $_26_RemoveDuplicatesFromSortedArray_2 {
    public int removeDuplicates(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[left] == nums[right]) {
                continue;
            }
            nums[++left] = nums[right];
        }

        return left + 1;
    }
}
