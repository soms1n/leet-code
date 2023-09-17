package ru.somsin.leetcode.problems.array.easy;

import java.util.HashMap;
import java.util.Map;

public class $_961_NRepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] nums) {
        int result = 0, max = 0;

        Map<Integer, Integer> numbers = new HashMap<>();
        for (int num : nums) {
            Integer number = numbers.get(num);
            number = number == null ? 0 : ++number;
            numbers.put(num, number);
            result = Math.max(result, number);

            if (max <= number) {
                result = num;
                max = number;
            }
        }

        return result;
    }
}
