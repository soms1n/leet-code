package ru.somsin.leetcode.problems;

public class $_28_FindTheIndexOfTheFirstOccurrenceInAString_1 {
    public int strStr(String haystack, String needle) {
        for (int left = 0, right = 0; left < haystack.length(); left++) {
            if (haystack.charAt(left) == needle.charAt(right)) {
                right++;
            } else {
                left -= right;
                right = 0;
            }

            if (right == needle.length()) {
                return left - (right - 1);
            }
        }

        return -1;
    }
}
