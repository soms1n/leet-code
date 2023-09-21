package ru.somsin.leetcode.problems.array.easy;

public class $_1582_SpecialPositionsInABinaryMatrix {
    public int numSpecial(int[][] mat) {
        int[] rows = new int[mat.length], columns = new int[mat[0].length];

        for (int row = 0; row < mat.length; row++) {
            for (int column = 0; column < mat[row].length; column++) {
                if (mat[row][column] == 1) {
                    rows[row]++;
                    columns[column]++;
                }
            }
        }

        int counter = 0;

        for (int row = 0; row < mat.length; row++) {
            for (int column = 0; column < mat[row].length; column++) {
                if (mat[row][column] == 1 && rows[row] == 1 && columns[column] == 1) {
                    counter++;
                }
            }
        }

        return counter;
    }
}
