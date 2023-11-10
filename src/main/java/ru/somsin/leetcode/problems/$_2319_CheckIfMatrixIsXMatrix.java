package ru.somsin.leetcode.problems;

public class $_2319_CheckIfMatrixIsXMatrix {
    public boolean checkXMatrix(int[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0, length = grid[row].length; column < length; column++) {
                if (row == column || column == length - row - 1) {
                    if (grid[row][column] == 0) {
                        return false;
                    }

                    continue;
                }

                if (grid[row][column] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
