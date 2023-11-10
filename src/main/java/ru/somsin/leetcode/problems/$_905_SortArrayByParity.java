package ru.somsin.leetcode.problems;

public class $_905_SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            if (nums[left] % 2 == 0) {
                left++;
            } else if (nums[right] % 2 == 0) {
                int temp = nums[left];
                nums[left++] = nums[right];
                nums[right--] = temp;
            } else {
                right--;
            }
        }

        return nums;
    }
}
