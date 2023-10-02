package ru.somsin.leetcode.problems.array.medium;

import java.util.HashSet;
import java.util.Set;

public class $_73_SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rowsIndexes = new HashSet<>();
        Set<Integer> columnsIndexes = new HashSet<>();

        int rows = matrix.length, columns = matrix[0].length;

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (matrix[row][column] == 0) {
                    rowsIndexes.add(row);
                    columnsIndexes.add(column);
                }
            }
        }

        for (int row : rowsIndexes) {
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = 0;
            }
        }

        for (int column : columnsIndexes) {
            for (int row = 0; row < rows; row++) {
                matrix[row][column] = 0;
            }
        }
    }
}
