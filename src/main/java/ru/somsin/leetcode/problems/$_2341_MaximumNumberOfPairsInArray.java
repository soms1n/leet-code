package ru.somsin.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class $_2341_MaximumNumberOfPairsInArray {
    public int[] numberOfPairs(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        int pairs = 0;

        for (int num : nums) {
            if (numbers.contains(num)) {
                numbers.remove(num);
                pairs++;
            } else {
                numbers.add(num);
            }
        }

        return new int[]{pairs, nums.length - pairs * 2};
    }
}
