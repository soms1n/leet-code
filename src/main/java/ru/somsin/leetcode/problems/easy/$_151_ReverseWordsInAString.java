package ru.somsin.leetcode.problems.easy;

public class $_151_ReverseWordsInAString {
    private static final String EMPTY = "";
    private static final String SPACE = " ";

    public String reverseWords(String s) {
        String result = EMPTY;

        String[] words = s.split(SPACE);

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }

            result = word + SPACE + result;
        }

        return result.trim();
    }
}
