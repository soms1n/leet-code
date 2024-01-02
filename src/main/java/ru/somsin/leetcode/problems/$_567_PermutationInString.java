package ru.somsin.leetcode.problems;

import java.util.Arrays;

public class $_567_PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Counter = new int[26];
        int[] s2Counter = new int[26];

        for (char ch : s1.toCharArray()) {
            s1Counter[ch - 'a']++;
        }

        int left = 0, right = 0;

        while (right < s2.length()) {
            s2Counter[s2.charAt(right) - 'a']++;

            if (right - left + 1 == s1.length()) {
                if (Arrays.equals(s1Counter, s2Counter)) {
                    return true;
                }
                s2Counter[s2.charAt(left++) - 'a']--;
            }

            right++;
        }

        return false;
    }
}
