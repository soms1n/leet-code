package ru.somsin.leetcode.problems;

public class $_485_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, counter = 0;

        for (int num : nums) {
            counter = num == 0 ? 0 : counter + 1;
            max = Math.max(max, counter);
        }

        return max;
    }
}
