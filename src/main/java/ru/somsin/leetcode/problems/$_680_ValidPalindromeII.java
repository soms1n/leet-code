package ru.somsin.leetcode.problems;

public class $_680_ValidPalindromeII {
    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();

        boolean wasLeftError = false;
        boolean wasRightError = false;

        for (int left = 0, right = s.length() - 1; left <= right; ) {
            if (chars[left] == chars[right]) {
                left++;
                right--;
            } else if (wasLeftError || wasRightError) {
                return false;
            } else if (chars[left + 1] == chars[right]) {
                wasLeftError = true;
                left++;
            } else if (chars[right - 1] == chars[left]) {
                wasRightError = true;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}
