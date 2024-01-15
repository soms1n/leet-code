package ru.somsin.leetcode.problems;

public class $_75_SortColors {
    public void sortColors(int[] nums) {
        int[] counter = new int[3];

        for (int num : nums) {
            counter[num]++;
        }

        for (int color = 0, index = 0; color < 3; color++) {
            for (int num = 0; num < counter[color]; num++) {
                nums[index++] = color;
            }
        }
    }
}
