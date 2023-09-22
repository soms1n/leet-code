package ru.somsin.leetcode.problems.string.easy;

public class $_20_ValidParentheses {
    public boolean isValid(String s) {
        int[] counter = new int[6];

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(' -> counter[0]++;
                case ')' -> counter[1]++;
                case '[' -> counter[2]++;
                case ']' -> counter[3]++;
                case '{' -> counter[4]++;
                case '}' -> counter[5]++;
            }
        }

        for (int i = 1; i < counter.length; i += 2) {
            if (counter[i - 1] != counter[i]) {
                return false;
            }
        }

        return true;
    }
}
