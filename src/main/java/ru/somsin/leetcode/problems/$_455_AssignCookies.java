package ru.somsin.leetcode.problems;

import java.util.Arrays;

public class $_455_AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int counter = 0;

        for (int gi = g.length - 1, si = s.length - 1; gi >= 0 && si >= 0; gi--) {
            if (s[si] >= g[gi]) {
                counter++;
                si--;
            }
        }

        return counter;
    }
}
