package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class $_77_Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int[] nums = new int[n];

        for (int number = 1; number <= n; number++) {
            nums[number - 1] = number;
        }

        combine(nums, k, 0, new ArrayList<>(), result);

        return result;
    }

    private void combine(int[] nums, int k, int position, List<Integer> list, List<List<Integer>> result) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }

        if (position == nums.length) {
            return;
        }

        list.add(nums[position]);

        combine(nums, k, position + 1, list, result);

        list.remove(list.size() - 1);

        combine(nums, k, position + 1, list, result);
    }
}
