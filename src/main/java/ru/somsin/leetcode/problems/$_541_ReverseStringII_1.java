package ru.somsin.leetcode.problems;

public class $_541_ReverseStringII_1 {
    public String reverseStr(String s, int k) {
        int left = 0, right = Math.min(k - 1, s.length() - 1);
        char[] result = s.toCharArray();

        while (true) {
            for (int i = left, j = right; i < j; i++, j--) {
                char temp = result[i];
                result[i] = result[j];
                result[j] = temp;
            }

            left += k * 2;
            right += k * 2;

            if (left < s.length()) {
                if (right >= s.length()) {
                    right = s.length() - 1;
                }
            } else {
                return new String(result);
            }
        }
    }
}
