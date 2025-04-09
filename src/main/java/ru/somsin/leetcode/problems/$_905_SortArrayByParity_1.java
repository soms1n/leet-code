package ru.somsin.leetcode.problems;

public class $_905_SortArrayByParity_1 {
    public int[] sortArrayByParity(int[] nums) {
        for (int left = 0, right = 0; right < nums.length; right++) {
            if (nums[right] % 2 == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right = left++;
            }
        }
        return nums;
    }
}
