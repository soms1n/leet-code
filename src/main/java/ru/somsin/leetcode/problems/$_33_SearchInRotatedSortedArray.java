package ru.somsin.leetcode.problems;

import java.util.Arrays;

public class $_33_SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int length = nums.length;

        int left = 0, right = length - 1;

        if (target <= nums[length - 1] && target < nums[0]) {
            left = length / 2;
            right = length - 1;

            if (nums[left] > target) {
                left++;
            }
        } else if (target > nums[length - 1]) {
            right = length / 2;
        }

        int result = Arrays.binarySearch(nums, left, right + 1, target);

        return result < 0 ? -1 : result;
    }
}
