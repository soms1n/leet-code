package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $_90_SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> set = new ArrayList<>();

        Arrays.sort(nums);

        defineSubsets(nums, 0, subsets, set, true);

        return subsets;
    }

    private void defineSubsets(int[] nums, int position, List<List<Integer>> subsets, List<Integer> set, boolean add) {
        if (position == nums.length) {
            subsets.add(new ArrayList<>(set));
            return;
        }

        if (add || nums[position - 1] != nums[position]) {
            set.add(nums[position]);

            defineSubsets(nums, position + 1, subsets, set, true);

            set.remove(set.size() - 1);
        }

        defineSubsets(nums, position + 1, subsets, set, false);
    }
}
