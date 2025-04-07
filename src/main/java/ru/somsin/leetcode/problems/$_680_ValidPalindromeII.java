package ru.somsin.leetcode.problems;

public class $_680_ValidPalindromeII {
    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        boolean wasError = false, itsOver = false;
        int savedLeft = 0, savedRight = 0;

        for (int left = 0, right = s.length() - 1; left <= right; ) {
            if (chars[left] == chars[right]) {
                left++;
                right--;
            } else if (wasError) {
                if (itsOver) {
                    return false;
                }

                itsOver = true;
                left = savedLeft;
                right = savedRight;
            } else if (chars[left + 1] == chars[right]) {
                wasError = true;

                if (chars[right - 1] == chars[left]) {
                    savedLeft = left;
                    savedRight = right - 1;
                }

                left++;
            } else if (chars[right - 1] == chars[left]) {
                wasError = true;

                if (chars[left + 1] == chars[right]) {
                    savedLeft = left + 1;
                    savedRight = right;
                }

                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}
