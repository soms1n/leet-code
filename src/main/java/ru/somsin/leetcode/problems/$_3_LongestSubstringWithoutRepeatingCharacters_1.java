package ru.somsin.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class $_3_LongestSubstringWithoutRepeatingCharacters_1 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> chars = new HashSet<>();
        int result = 0;

        for (int left = 0, right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while (chars.contains(ch)) {
                chars.remove(s.charAt(left++));
            }

            chars.add(ch);
            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
