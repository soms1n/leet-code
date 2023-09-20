package ru.somsin.leetcode.problems.array.easy;

import java.util.HashMap;
import java.util.Map;

public class $_1582_SpecialPositionsInABinaryMatrix {
    public int numSpecial(int[][] mat) {
        Map<Integer, Integer> ones = new HashMap<>();

        for (int row = 0; row < mat.length; row++) {
            for (int column = 0; column < mat[row].length; column++) {
                if (mat[row][column] == 1) {
                    int counter = ones.getOrDefault(row, 0) + 1;
                    ones.put(row, counter);

                    if (counter > 1) {
                        break;
                    }
                }
            }
        }

        int counter = 0;

        for (int column = 0; column < mat[0].length; column++) {
            int numbers = 0;
            for (int[] rows : mat) {
                if (rows[column] == 1) {
                    numbers = ones.getOrDefault(column, 0) + 1;
                    ones.put(column, numbers);

                    if (numbers > 2) {
                        break;
                    }
                }
            }
            counter += numbers == 2 ? 1 : 0;
        }

        return counter;
    }
}
