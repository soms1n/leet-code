package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class $_784_LetterCasePermutation {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();

        letterCasePermutation(s, 0, result);

        return result;
    }

    private void letterCasePermutation(String s, int position, List<String> result) {
        if (position == s.length()) {
            result.add(s);
            return;
        }

        char[] sCharArray = s.toCharArray();

        char currentChar = sCharArray[position];

        if (Character.isLetter(currentChar)) {
            char currenCharUpper = Character.toUpperCase(currentChar);

            sCharArray[position] = currenCharUpper == currentChar ? Character.toLowerCase(currentChar) : currenCharUpper;

            letterCasePermutation(String.valueOf(sCharArray), position + 1, result);

            sCharArray[position] = currentChar;
        }

        letterCasePermutation(String.valueOf(sCharArray), position + 1, result);
    }
}
