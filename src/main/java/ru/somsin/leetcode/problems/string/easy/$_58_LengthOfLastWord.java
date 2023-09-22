package ru.somsin.leetcode.problems.string.easy;

public class $_58_LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int counter = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (counter > 0 && s.charAt(i) == ' ') {
                return counter;
            }

            counter += s.charAt(i) == ' ' ? 0 : 1;
        }

        return counter;
    }
}
