package ru.somsin.leetcode.problems.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class $_1365_HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = nums.clone();

        Arrays.sort(result);

        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < result.length; i++) {
            numbers.putIfAbsent(result[i], i);
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = numbers.get(nums[i]);
        }

        return result;
    }
}
