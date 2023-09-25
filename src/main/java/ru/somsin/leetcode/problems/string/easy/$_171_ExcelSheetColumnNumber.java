package ru.somsin.leetcode.problems.string.easy;

public class $_171_ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int result = columnTitle.charAt(columnTitle.length() - 1) - 64;
        ;

        for (int left = 1, right = columnTitle.length() - 2; left < columnTitle.length(); left++, right--) {
            result += left * 26 * (columnTitle.charAt(right) - 64);
        }

        return result;
    }
}
