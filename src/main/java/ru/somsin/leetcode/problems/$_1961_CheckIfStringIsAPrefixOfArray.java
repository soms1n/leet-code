package ru.somsin.leetcode.problems;

public class $_1961_CheckIfStringIsAPrefixOfArray {
    public boolean isPrefixString(String s, String[] words) {
        int i = 0;

        for (String word : words) {
            for (int j = 0; j < word.length(); j++, i++) {
                if (i == s.length()) {
                    return j == 0;
                }

                if (s.charAt(i) != word.charAt(j)) {
                    return false;
                }
            }
        }

        return i == s.length();
    }
}
