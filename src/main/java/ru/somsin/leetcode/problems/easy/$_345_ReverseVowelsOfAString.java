package ru.somsin.leetcode.problems.easy;

import java.util.Set;

public class $_345_ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] result = s.toCharArray();
        int left = 0, right = s.length() - 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (vowels.contains(result[left]) && vowels.contains(result[right])) {
                char temp = result[left];
                result[left++] = result[right];
                result[right--] = temp;
            } else if (vowels.contains(result[left]) && !vowels.contains(result[right])) {
                right--;
            } else if (!vowels.contains(result[left]) && vowels.contains(result[right])) {
                left++;
            } else {
                right--;
                left++;
            }

            if (left > right) {
                break;
            }
        }

        return new String(result);
    }
}
