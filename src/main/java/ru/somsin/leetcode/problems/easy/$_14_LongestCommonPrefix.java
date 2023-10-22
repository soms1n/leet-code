package ru.somsin.leetcode.problems.easy;

import java.util.Arrays;

public class $_14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        int n = Math.min(first.length(), last.length());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return result.toString();
            }
            result.append(first.charAt(i));
        }

        return result.toString();
    }
}
