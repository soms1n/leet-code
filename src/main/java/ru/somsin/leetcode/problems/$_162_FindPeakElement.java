package ru.somsin.leetcode.problems;

public class $_162_FindPeakElement {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1 || nums[0] > nums[1]) {
            return 0;
        } else if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }

        int left = 1, right = nums.length - 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int midValue = nums[mid];

            if (midValue > nums[mid - 1] && midValue > nums[mid + 1]) {
                return mid;
            } else if (midValue < nums[mid - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
