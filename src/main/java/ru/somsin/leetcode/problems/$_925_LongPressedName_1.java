package ru.somsin.leetcode.problems;

public class $_925_LongPressedName_1 {
    public boolean isLongPressedName(String name, String typed) {
        int left = 0;

        for (int right = 0; right < typed.length(); right++) {
            if (left < name.length() && name.charAt(left) == typed.charAt(right)) {
                left++;
            } else if (right == 0 || typed.charAt(right) != typed.charAt(right - 1)) {
                return false;
            }
        }

        return left == name.length();
    }
}
