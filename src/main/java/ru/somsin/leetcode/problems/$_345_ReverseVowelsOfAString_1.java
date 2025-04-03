package ru.somsin.leetcode.problems;

import java.util.Set;

public class $_345_ReverseVowelsOfAString_1 {
    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    public String reverseVowels(String s) {
        char[] result = s.toCharArray();

        for (int left = 0, right = s.length() - 1; left < right;) {
            if (!VOWELS.contains(result[left])) {
                left++;
            } else if (!VOWELS.contains(result[right])) {
                right--;
            } else {
                char temp = result[left];
                result[left++] = result[right];
                result[right--] = temp;
            }
        }

        return new String(result);
    }
}
