package ru.somsin.leetcode.problems;

import java.util.Objects;

public class $_389_FindTheDifference {
    public char findTheDifference(String s, String t) {
        if (Objects.equals(s, "")) {
            return t.charAt(0);
        }

        int[] sChars = new int[26];
        int[] tChars = new int[26];

        for (int i = 0; i < s.length(); i++) {
            sChars[s.charAt(i) - 97]++;
            tChars[t.charAt(i) - 97]++;
        }

        tChars[t.charAt(t.length() - 1) - 97]++;

        for (int i = 0; i < sChars.length; i++) {
            if (sChars[i] != tChars[i]) {
                return (char) (i + 97);
            }
        }

        throw new RuntimeException();
    }
}
