package ru.somsin.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class $_159_LongestSubstringWithAtMostTwoDistinctCharacters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> window = new HashMap<>();

        int left = 0, right = 0, result = 0;

        while (right < s.length()) {
            char current = s.charAt(right);

            window.put(current, window.getOrDefault(current, 0) + 1);

            while (window.size() > 2) {
                char leftChar = s.charAt(left);
                int counter = window.get(leftChar) - 1;

                if (counter == 0) {
                    window.remove(leftChar);
                } else {
                    window.put(leftChar, counter);
                }

                left++;
            }

            result = Math.max(result, right - left + 1);

            right++;
        }

        return result;
    }
}
