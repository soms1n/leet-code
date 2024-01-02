package ru.somsin.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class $_340_LongestSubstringWithAtMostKDistinctCharacters {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> window = new HashMap<>();

        int left = 0, right = 0, result = 0;

        while (right < s.length()) {
            char current = s.charAt(right);

            window.put(current, window.getOrDefault(current, 0) + 1);

            while (window.size() > k) {
                char leftChar = s.charAt(left);
                Integer counter = window.get(leftChar);

                if (counter == 0) {
                    window.remove(leftChar);
                } else {
                    window.put(leftChar, counter);
                }
            }

            result = Math.max(result, right - left + 1);

            right++;
        }

        return result;
    }
}
