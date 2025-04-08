package ru.somsin.leetcode.problems;

public class $_844_BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        int left = s.length() - 1, right = t.length() - 1;
        int leftSharp = 0, rightSharp = 0;

        while (left >= 0 || right >= 0) {
            if (left >= 0 && s.charAt(left) == '#') {
                left--;
                leftSharp++;
            } else if (right >= 0 && t.charAt(right) == '#') {
                right--;
                rightSharp++;
            } else if (left >= 0 && leftSharp > 0) {
                left--;
                leftSharp--;
            } else if (right >= 0 && rightSharp > 0) {
                right--;
                rightSharp--;
            } else if (left < 0 || right < 0 || s.charAt(left) != t.charAt(right)) {
                return false;
            } else {
                left--;
                right--;
            }
        }
        return left == right;
    }
}
