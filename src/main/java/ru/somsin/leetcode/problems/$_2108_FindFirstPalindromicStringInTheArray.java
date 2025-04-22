package ru.somsin.leetcode.problems;

public class $_2108_FindFirstPalindromicStringInTheArray {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            int left = 0, right = word.length() - 1;

            for (; left < right; left++, right--) {
                if (word.charAt(left) != word.charAt(right)) {
                    break;
                }
            }

            if (left >= right) {
                return word;
            }
        }

        return "";
    }
}
