package ru.somsin.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class $_128_LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            numbers.add(num);
        }

        int result = 0;

        for (int num : nums) {
            if (!numbers.contains(num - 1)) {
                int next = num + 1;

                while (numbers.contains(next)) {
                    next++;
                }

                result = Math.max(result, next - num);
            }
        }

        return result;
    }
}
