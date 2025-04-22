package ru.somsin.leetcode.problems;

public class $_2000_ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        char[] result = word.toCharArray();

        for (int right = 0; right < word.length(); right++) {
            if (word.charAt(right) == ch) {
                for (int left = 0; left < right; left++, right--) {
                    result[left] = word.charAt(right);
                    result[right] = word.charAt(left);
                }
                break;
            }
        }

        return new String(result);
    }
}
