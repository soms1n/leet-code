package ru.somsin.leetcode.problems;

public class $_424_LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] counter = new int[26];
        int left = 0, right = 0, result = 0, maxFrequence = 0;

        while (right < s.length()) {
            maxFrequence = Math.max(maxFrequence, ++counter[s.charAt(right) - 'A']);

            if (right - left + 1 - maxFrequence > k) {
                counter[s.charAt(left++) - 'A']--;
            }

            result = Math.max(result, right - left + 1);

            right++;
        }

        return result;
    }
}
