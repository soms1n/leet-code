package ru.somsin.leetcode.problems.array.easy;

import java.util.HashMap;
import java.util.Map;

public class $_961_NRepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int num : nums) {
            numbers.put(num, numbers.getOrDefault(num, 0) + 1);
        }

        for (int number : numbers.keySet()) {
            if (numbers.get(number) > 1) {
                return number;
            }
        }

        throw new RuntimeException();
    }
}
