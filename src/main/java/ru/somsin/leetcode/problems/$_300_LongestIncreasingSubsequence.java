package ru.somsin.leetcode.problems;

import java.util.Arrays;

public class $_300_LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int[] sortedArray = new int[nums.length];
        int length = 0;

        for (int num : nums) {
            int index = Arrays.binarySearch(sortedArray, 0, length, num);

            if (index < 0) {
                index = -(index + 1);
            }

            sortedArray[index] = num;

            if (index == length) {
                length++;
            }
        }

        return length;
    }
}
