package ru.somsin.leetcode.problems;

public class $_925_LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        if (typed.length() < name.length()) {
            return false;
        }

        int left = 0;

        for (int right = 0; right < typed.length(); right++) {
            char nameChar = name.charAt(left == name.length() ? left - 1 : left);
            char typedChar = typed.charAt(right);

            if (nameChar == typedChar) {
                left++;
            } else if (left > 0 && name.charAt(left - 1) == typedChar) {
                continue;
            } else {
                return false;
            }

            if (left > name.length()) {
                left--;
            }
        }

        return left == name.length();
    }
}
