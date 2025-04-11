package ru.somsin.leetcode.problems;

public class $_942_DIStringMatch {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] result = new int[n + 1];
        int increase = 0, decrease = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                result[i] = increase++;
            } else {
                result[i] = decrease--;
            }
        }

        result[n] = decrease;

        return result;
    }
}
