package ru.somsin.leetcode.problems;

public class $_1768_MergeStringsAlternately_1 {
    public String mergeAlternately(String word1, String word2) {
        char[] result = new char[word1.length() + word2.length()];

        for (int i = 0, left = 0, right = 0; i < result.length; ) {
            if (left < word1.length()) {
                result[i++] = word1.charAt(left++);
            }

            if (right < word2.length()) {
                result[i++] = word2.charAt(right++);
            }
        }

        return new String(result);
    }
}
