package ru.somsin.leetcode.problems.medium;

public class $_498_DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int steps = mat.length * mat[0].length;
        int[] result = new int[steps];
        boolean up = true, down = false;
        int firstRow = 0, lastRow = mat.length - 1, firstColumn = 0, lastColumn = mat[0].length - 1;

        for (int step = 0, row = 0, column = 0; step < steps; step++) {
            result[step] = mat[row][column];

            if (up) {
                if (row == firstRow || column == lastColumn) {
                    up = false;
                    down = true;

                    if (column == lastColumn) {
                        row += increment(row, lastRow);
                    } else {
                        column += increment(column, lastColumn);
                    }
                } else {
                    column += increment(column, lastColumn);
                    row -= decrement(row, firstRow);
                }
            } else if (down) {
                if (row == lastRow || column == firstColumn) {
                    up = true;
                    down = false;

                    if (row == lastRow) {
                        column += increment(column, lastColumn);
                    } else {
                        row += increment(row, lastRow);
                    }
                } else {
                    column -= decrement(column, firstColumn);
                    row += increment(row, lastRow);
                }
            }
        }

        return result;
    }

    private int increment(int value, int maxValue) {
        return value + 1 <= maxValue ? 1 : 0;
    }

    private int decrement(int value, int minValue) {
        return value - 1 >= minValue ? 1 : 0;
    }
}
