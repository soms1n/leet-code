package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class $_78_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();

        defineSubsets(nums, 0, subsets, new ArrayList<>());

        return subsets;
    }

    private void defineSubsets(int[] nums, int position, List<List<Integer>> subsets, List<Integer> set) {
        if (position == nums.length) {
            subsets.add(new ArrayList<>(set));
            return;
        }

        set.add(nums[position]);

        defineSubsets(nums, position + 1, subsets, set);

        set.remove(set.size() - 1);

        defineSubsets(nums, position + 1, subsets, set);
    }
}
