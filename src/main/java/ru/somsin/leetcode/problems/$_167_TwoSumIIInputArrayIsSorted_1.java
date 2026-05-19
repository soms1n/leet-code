package ru.somsin.leetcode.problems;

public class $_167_TwoSumIIInputArrayIsSorted_1 {
    public int[] twoSum(int[] numbers, int target) {
        for (int left = 0, right = numbers.length - 1; left < right;) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] {++left, ++right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }
}
