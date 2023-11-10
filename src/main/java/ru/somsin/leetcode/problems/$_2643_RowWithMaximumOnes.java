package ru.somsin.leetcode.problems;

public class $_2643_RowWithMaximumOnes {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxCounter = 0, minIndex = 0;

        for (int i = 0; i < mat.length; i++) {
            int counter = 0;
            for (int j = 0; j < mat[i].length; j++) {
                counter += mat[i][j];
            }

            if (counter > maxCounter) {
                maxCounter = counter;
                minIndex = i;
            }
        }

        return new int[]{minIndex, maxCounter};
    }
}
