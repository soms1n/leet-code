package ru.somsin.leetcode.problems.string.easy;

import java.util.HashMap;
import java.util.Map;

public class $_13_RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int value = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char nextCh = i + 1 == s.length() ? 0 : s.charAt(i + 1);

            switch (ch) {
                case 'I' -> {
                    switch (nextCh) {
                        case 'V' -> {
                            value += 4;
                            i++;
                        }
                        case 'X' -> {
                            value += 9;
                            i++;
                        }
                        default -> value += values.get(ch);
                    }
                }
                case 'X' -> {
                    switch (nextCh) {
                        case 'L' -> {
                            value += 40;
                            i++;
                        }
                        case 'C' -> {
                            value += 90;
                            i++;
                        }
                        default -> value += values.get(ch);
                    }
                }
                case 'C' -> {
                    switch (nextCh) {
                        case 'D' -> {
                            value += 400;
                            i++;
                        }
                        case 'M' -> {
                            value += 900;
                            i++;
                        }
                        default -> value += values.get(ch);
                    }
                }
                default -> value += values.get(ch);
            }
        }

        return value;
    }
}
