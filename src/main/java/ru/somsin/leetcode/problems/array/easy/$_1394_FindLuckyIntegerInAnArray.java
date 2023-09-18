package ru.somsin.leetcode.problems.array.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class $_1394_FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> numbers = new HashMap<>();
        Set<Integer> values = new HashSet<>();

        for (int value : arr) {
            int number = numbers.getOrDefault(value, 0) + 1;
            numbers.put(value, number);

            if (number == value) {
                values.add(value);
            } else if (number > value) {
                values.remove(value);
            }
        }

        return values.stream()
                .max(Integer::compareTo)
                .orElse(-1);
    }
}
