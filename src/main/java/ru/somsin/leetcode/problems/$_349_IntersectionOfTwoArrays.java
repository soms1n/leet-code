package ru.somsin.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class $_349_IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> numbers = new HashSet<>();

        for (int number : nums1) {
            numbers.add(number);
        }

        if (numbers.isEmpty()) {
            return null;
        }

        Set<Integer> result = new HashSet<>();

        for (int number : nums2) {
            if (numbers.contains(number)) {
                result.add(number);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
