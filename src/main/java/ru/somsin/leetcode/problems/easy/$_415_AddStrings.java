package ru.somsin.leetcode.problems.easy;

public class $_415_AddStrings {
    public String addStrings(String num1, String num2) {
        String result = "";
        boolean add = false;

        for (int index = Math.max(num1.length(), num2.length()) - 1, indexNum1 = num1.length() - 1, indexNum2 = num2.length() - 1; index >= 0; index--, indexNum1--, indexNum2--) {
            int total = 0;

            if (indexNum1 >= 0 && indexNum2 >= 0) {
                total = defineNumber(num1, indexNum1) + defineNumber(num2, indexNum2);
            } else if (indexNum1 >= 0) {
                total = defineNumber(num1, indexNum1);
            } else if (indexNum2 >= 0) {
                total = defineNumber(num2, indexNum2);
            }

            if (add) {
                add = false;
                total++;
            }

            if (total >= 10) {
                result = String.valueOf(total).charAt(1) + result;
                add = true;
            } else {
                result = total + result;
            }
        }

        if (add) {
            result = "1" + result;
        }

        return result;
    }

    private int defineNumber(String number, int index) {
        return (int) number.charAt(index) - 48;
    }
}
