package ru.somsin.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class $_54_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> visitedColumns = new HashSet<>();
        Set<Integer> visitedRows = new HashSet<>();

        boolean right = true, left = false, up = false, bot = false;

        int rows = matrix.length;
        int columns = matrix[0].length;
        int size = rows * columns;
        int limit = columns - 1;

        for (int row = 0, column = -1, step = 0; step < size; step++) {
            if (right) {
                visitedRows.add(row);

                if (++column == limit || visitedColumns.contains(column + 1)) {
                    right = false;
                    bot = true;
                    limit = rows - 1;
                }
            } else if (bot) {
                visitedColumns.add(column);

                if (++row == limit || visitedRows.contains(row + 1)) {
                    bot = false;
                    left = true;
                    limit = 0;
                }
            } else if (left) {
                visitedRows.add(row);

                if (--column == limit || visitedColumns.contains(column - 1)) {
                    left = false;
                    up = true;
                    limit = 0;
                }
            } else if (up) {
                visitedColumns.add(column);

                if (--row == limit || visitedRows.contains(row - 1)) {
                    up = false;
                    right = true;
                    limit = columns - 1;
                }
            }

            result.add(matrix[row][column]);
        }

        return result;
    }
}
