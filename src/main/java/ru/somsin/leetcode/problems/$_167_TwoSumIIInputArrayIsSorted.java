package ru.somsin.leetcode.problems;

public class $_167_TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int lValue = numbers[left], rValue = numbers[right];
            int sum = lValue + rValue;

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return null;
    }
}
