package ru.somsin.leetcode.problems;

public class $_821_ShortestDistanceToACharacter_1 {
    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        int position = -(s.length() - 1);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                position = i;
            }

            result[i] = Math.abs(position - i);
        }

        for (int i = position; i >= 0; i--) {
            if (s.charAt(i) == c) {
                position = i;
            }

            result[i] = Math.min(result[i], Math.abs(position - i));
        }

        return result;
    }
}
