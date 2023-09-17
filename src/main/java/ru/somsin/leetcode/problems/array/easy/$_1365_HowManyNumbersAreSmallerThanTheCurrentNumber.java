package ru.somsin.leetcode.problems.array.easy;

public class $_1365_HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int counter = 0;

            for (int num : nums) {
                if (num < nums[i]) {
                    counter++;
                }
            }

            result[i] = counter;
        }

        return result;
    }
}
