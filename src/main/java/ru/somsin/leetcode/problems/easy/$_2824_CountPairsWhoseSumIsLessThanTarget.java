package ru.somsin.leetcode.problems.easy;

import java.util.Collections;
import java.util.List;

public class $_2824_CountPairsWhoseSumIsLessThanTarget {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);

        int counter = 0, left = 0, right = nums.size() - 1;

        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                counter += right - left;
                left++;
            } else {
                right--;
            }
        }

        return counter;
    }
}
