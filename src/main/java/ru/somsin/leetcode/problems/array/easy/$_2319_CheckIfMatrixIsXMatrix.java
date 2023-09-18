package ru.somsin.leetcode.problems.array.easy;

public class $_2319_CheckIfMatrixIsXMatrix {
    public boolean checkXMatrix(int[][] grid) {
        int left = 0, right = grid[0].length - 1;
        int rows = grid.length, columns = grid[0].length;

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (column == left || column == right) {
                    continue;
                }

                if (grid[row][column] != 0) {
                    return false;
                }
            }

            if (grid[row][left] == 0 || grid[row][right] == 0) {
                return false;
            }

            int rowNumber = rows % 2 == 0 ? row + 1 : row;

            if (rowNumber < rows / 2) {
                left++;
                right--;
            } else if (row >= rows / 2) {
                left--;
                right++;
            }
        }

        return true;
    }
}
