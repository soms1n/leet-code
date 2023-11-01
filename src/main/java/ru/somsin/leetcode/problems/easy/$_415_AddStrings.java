package ru.somsin.leetcode.problems.easy;

public class $_415_AddStrings {
    public String addStrings(String num1, String num2) {
        return String.valueOf(defineNumber(num1) + defineNumber(num2));
    }

    private long defineNumber(String stringNumber) {
        long number = 0, multiply = 1;

        for (int index = stringNumber.length() - 1; index >= 0; index--, multiply *= 10) {
            number += (long) (stringNumber.charAt(index) - 48) * multiply;
        }

        return number;
    }
}
