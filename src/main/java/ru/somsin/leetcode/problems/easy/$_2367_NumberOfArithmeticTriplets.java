package ru.somsin.leetcode.problems.easy;

import java.util.HashSet;
import java.util.Set;

public class $_2367_NumberOfArithmeticTriplets {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int counter = 0;
        for (int num : nums) {
            counter += set.contains(num + diff) && set.contains(num + diff * 2) ? 1 : 0;
        }

        return counter;
    }
}
