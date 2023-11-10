package ru.somsin.leetcode.problems;

public class $_409_LongestPalindrome {
    public int longestPalindrome(String s) {
        int oddCounter = 0;
        int[] chars = new int[128];

        for (char ch : s.toCharArray()) {
            chars[ch]++;

            if (chars[ch] % 2 == 0) {
                oddCounter--;
            } else {
                oddCounter++;
            }
        }

        if (oddCounter > 1) {
            return s.length() - oddCounter + 1;
        }

        return s.length();
    }
}
