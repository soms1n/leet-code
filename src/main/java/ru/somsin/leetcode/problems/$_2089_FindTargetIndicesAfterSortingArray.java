package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class $_2089_FindTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less = 0, equals = 0;

        for (int num : nums) {
            if (num < target) {
                less++;
            } else if (num == target) {
                equals++;
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < equals; i++) {
            result.add(less++);
        }

        return result;
    }
}
