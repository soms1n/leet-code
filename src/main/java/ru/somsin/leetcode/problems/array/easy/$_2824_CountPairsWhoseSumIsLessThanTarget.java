package ru.somsin.leetcode.problems.array.easy;

import java.util.List;

public class $_2824_CountPairsWhoseSumIsLessThanTarget {
    public int countPairs(List<Integer> nums, int target) {
        int counter = 0;

        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    counter++;
                }
            }
        }

        return counter;
    }
}
