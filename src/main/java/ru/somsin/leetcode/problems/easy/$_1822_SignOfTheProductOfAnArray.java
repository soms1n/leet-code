package ru.somsin.leetcode.problems.easy;

public class $_1822_SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        int result = 1;

        for (int num : nums) {
            if (num == 0) {
                return 0;
            }

            result *= num > 0 ? 1 : -1;
        }

        return result;
    }
}
