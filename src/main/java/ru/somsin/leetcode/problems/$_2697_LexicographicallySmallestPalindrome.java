package ru.somsin.leetcode.problems;

public class $_2697_LexicographicallySmallestPalindrome {
    public String makeSmallestPalindrome(String s) {
        char[] result = new char[s.length()];

        for (int left = 0, right = s.length() - 1; left <= right; left++, right--) {
            char leftChar = s.charAt(left), rightChar = s.charAt(right);

            if (leftChar > rightChar) {
                leftChar = rightChar;
            } else if (leftChar < rightChar) {
                rightChar = leftChar;
            }

            result[left] = leftChar;
            result[right] = rightChar;
        }

        return new String(result);
    }
}
