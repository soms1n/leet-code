package ru.somsin.leetcode.problems;

public class $_922_SortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        for (int left = 0, right = 0; right < nums.length; right++) {
            if ((left % 2 == 0 && nums[right] % 2 == 0)
                    || (left % 2 != 0 && nums[right] % 2 != 0)) {
                int temp = nums[left];
                nums[left++] = nums[right];
                nums[right] = temp;
                right = left;
            }
        }

        return nums;
    }
}
