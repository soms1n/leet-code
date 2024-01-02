package ru.somsin.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class $_3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> counter = new HashSet<>();

        int left = 0, right = 0, result = 0;

        while (right < s.length()) {
            char current = s.charAt(right);

            while (counter.contains(current)) {
                counter.remove(s.charAt(left++));
            }

            counter.add(current);

            result = Math.max(result, counter.size());

            right++;
        }

        return result;
    }
}
