package ru.somsin.leetcode.problems.easy;

public class $_387_FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] chars = new int[26];

        for (char ch : s.toCharArray()) {
            chars[ch - 97]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (chars[s.charAt(i) - 97] == 1) {
                return i;
            }
        }

        return -1;
    }
}
