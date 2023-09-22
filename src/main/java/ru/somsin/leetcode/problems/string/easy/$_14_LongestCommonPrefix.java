package ru.somsin.leetcode.problems.string.easy;

public class $_14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String str = strs[i];

            for (int j = 0; j < result.length(); j++) {
                if (j == str.length() || str.charAt(j) != result.charAt(j)) {
                    result = result.substring(0, j);
                    break;
                }
            }
        }

        return result;
    }
}
