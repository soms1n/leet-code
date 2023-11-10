package ru.somsin.leetcode.problems.easy;

public class $_6_ZigzagConversion {
    public String convert(String s, int numRows) {
        int length = s.length();

        if (length < numRows) {
            return s;
        }

        char[][] resultByRow = new char[numRows][length / numRows * 2 + 1];
        int[] counter = new int[numRows];

        boolean isDown = true;

        for (int i = 0, row = 0; i < length; i++) {
            resultByRow[row][counter[row]] = s.charAt(i);

            counter[row]++;

            if (isDown) {
                row++;
            } else {
                row--;
            }

            if (row == numRows) {
                isDown = false;
                row -= 2;

                if (row < 0) {
                    isDown = true;
                    row = 0;
                }
            } else if (row < 0) {
                isDown = true;
                row += 2;
            }
        }

        StringBuilder result = new StringBuilder();

        for (char[] str : resultByRow) {
            for (char ch : str) {
                if (ch == '\u0000') {
                    break;
                }
                result.append(ch);
            }
        }

        return result.toString();
    }
}
