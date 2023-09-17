package ru.somsin.leetcode.problems.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $_2089_FindTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
            } else if (nums[i] > target) {
                break;
            }
        }

        return result;
    }
}
