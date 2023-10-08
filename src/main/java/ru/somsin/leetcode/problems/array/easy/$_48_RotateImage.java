package ru.somsin.leetcode.problems.array.easy;

public class $_48_RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int steps = n * n, left = 0, right = n - 1, temp = matrix[0][0];

        for (int step = 0, row = 0, column = 0, offset = 0; step < steps - 1; step++) {
            int value = temp;

            int tempRow = row;
            row = left + column;
            column = right - tempRow;

            temp = matrix[row][column];
            matrix[row][column] = value;

            if (temp == value) {
                row = ++offset;
                column = 0;
                temp = matrix[row][column];
            }
        }
    }
}
