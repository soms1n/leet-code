package ru.somsin.leetcode.problems;

public class $_27_RemoveElement_1 {
    public int removeElement(int[] nums, int val) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != val) {
                        nums[i] = nums[j];
                        nums[j] = val;
                        break;
                    }
                }

                if (nums[i] == val) {
                    break;
                }
            }

            result++;
        }

        return result;
    }
}
