package ru.somsin.leetcode.problems;

public class $_1332_RemovePalindromicSubsequences {
    public int removePalindromeSub(String s) {
        return s.isEmpty() ? 0 : s.contentEquals(new StringBuilder(s).reverse()) ? 1 : 2;
    }
}
