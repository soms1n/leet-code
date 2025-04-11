package ru.somsin.leetcode.problems;

public class $_977_SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = n - 1, left = 0, right = n - 1; i >= 0; i--) {
            int leftPow = (int) Math.pow(nums[left], 2);
            int rightPow = (int) Math.pow(nums[right], 2);

            if (leftPow >= rightPow) {
                result[i] = leftPow;
                left++;
            } else {
                result[i] = rightPow;
                right--;
            }
        }

        return result;
    }
}
