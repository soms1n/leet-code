package ru.somsin.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class $_13_RomanToInteger {
    private final Map<Character, Integer> values = new HashMap<>();

    {
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
    }

    public int romanToInt(String s) {
        int result = 0, value = 0, prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            value = values.get(s.charAt(i));
            result += value < prev ? -value : value;
            prev = value;
        }

        return result;
    }
}
