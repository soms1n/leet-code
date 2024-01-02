package ru.somsin.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class $_159_LongestSubstringWithAtMostTwoDistinctCharacters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Set<Character> window = new HashSet<>();

        int left = 0, right = 0, result = 0;

        while (right < s.length()) {
            char current = s.charAt(right);

            window.add(current);

            while (window.size() > 2) {
                window.remove(s.charAt(left++));
            }

            result = Math.max(result, right - left + 1);
            right++;
        }

        return result;
    }
}
