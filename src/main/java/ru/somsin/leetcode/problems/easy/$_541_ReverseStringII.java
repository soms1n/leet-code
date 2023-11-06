package ru.somsin.leetcode.problems.easy;

public class $_541_ReverseStringII {
    public String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();

        int length = s.length(), i = 0;

        while (i < length) {
            int offset = i + k - 1;

            for (int j = offset < length ? offset : length - 1; j >= i; j--) {
                result.append(s.charAt(j));
            }

            for (int j = offset + 1, counter = 0; j < s.length() && counter < k; j++, counter++) {
                result.append(s.charAt(j));
            }

            i = offset + k + 1;
        }

        return result.toString();
    }
}
