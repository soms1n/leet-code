package ru.somsin.leetcode.problems.easy;

public class $_463_IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return dfs(grid, i, j);
                }
            }
        }
        return 0;
    }

    private int dfs(int[][] grid, int row, int column) {
        if (row < 0 || column < 0 || row >= grid.length || column >= grid[0].length || grid[row][column] == 0) {
            return 1;
        } else if (grid[row][column] == -1) {
            return 0;
        }

        grid[row][column] = -1;

        int total = 0;

        total += dfs(grid, row - 1, column);
        total += dfs(grid, row, column + 1);
        total += dfs(grid, row + 1, column);
        total += dfs(grid, row, column - 1);

        return total;
    }
}
