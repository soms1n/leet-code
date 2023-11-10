package ru.somsin.leetcode.problems;

public class $_459_RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();

        if (length % 2 != 0) {
            return false;
        }

        char firstChar = s.charAt(0);
        int right = 0;

        for (int index = 1; index < length; index++) {
            if (firstChar == s.charAt(index)) {
                right = index;
            }
        }

        for (int left = 0, offset = right; left + offset < length; left++, right++) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
        }

        return true;
    }
}
