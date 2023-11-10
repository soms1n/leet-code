package ru.somsin.leetcode.problems;

public class $_415_AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int indexNum1 = num1.length() - 1, indexNum2 = num2.length() - 1;
        int additinalValue = 0;

        while (indexNum1 >= 0 || indexNum2 >= 0 || additinalValue > 0) {
            int value = additinalValue;

            if (indexNum1 >= 0) {
                value += num1.charAt(indexNum1--) - '0';
            }

            if (indexNum2 >= 0) {
                value += num2.charAt(indexNum2--) - '0';
            }

            result.append(value % 10);

            additinalValue = value >= 10 ? 1 : 0;
        }

        return result.reverse().toString();
    }
}
