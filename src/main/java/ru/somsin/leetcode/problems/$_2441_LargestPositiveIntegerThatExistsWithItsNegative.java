package ru.somsin.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class $_2441_LargestPositiveIntegerThatExistsWithItsNegative {
    public int findMaxK(int[] nums) {
        Set<Integer> cache = new HashSet<>();

        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            cache.add(num);
            if (cache.contains(num * -1)) {
                max = Math.max(max, Math.abs(num));
            }
        }

        return max == Integer.MIN_VALUE ? -1 : max;
    }
}
