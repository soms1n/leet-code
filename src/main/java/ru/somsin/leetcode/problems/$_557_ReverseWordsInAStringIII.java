package ru.somsin.leetcode.problems;

public class $_557_ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        char[] result = s.toCharArray();

        for (int left = 0, right = 0; right < s.length(); ) {
            while (right == s.length() - 2 || (right + 1 < s.length() - 1 && result[right + 1] != ' ')) {
                right++;
            }

            for (int i = left, j = right; i < j; i++, j--) {
                char temp = result[i];
                result[i] = result[j];
                result[j] = temp;
            }

            right += 2;
            left = right;
        }

        return new String(result);
    }
}
