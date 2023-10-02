package ru.somsin.leetcode.problems.array.medium;

import java.util.ArrayList;
import java.util.List;

public class $_442_FindAllDuplicatesInAnArray {
    static public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            int position = Math.abs(num) - 1;

            if (nums[position] < 0) {
                result.add(position + 1);
            } else {
                nums[position] *= -1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}
