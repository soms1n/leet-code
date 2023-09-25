package ru.somsin.leetcode.problems.string.easy;

public class $_171_ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (char ch : columnTitle.toCharArray()) {
            result = result * 26 + (ch - 64);
        }

        return result;
    }
}
