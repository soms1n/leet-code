package ru.somsin.leetcode.problems;

public class $_56_MergeIntervals {
    public int[][] merge(int[][] intervals) {
        int rows = intervals.length;

        int size = 0, left = -1, right = -1;

        int[] temp = new int[rows * 2];

        for (int row = 0; row < rows; row++) {
            if (left == -1) {
                left = intervals[row][0];
                right = intervals[row][1];
            }

            if (intervals[row][0] <= right) {
                if (intervals[row][1] > right) {
                    right = intervals[row][1];
                }

                if (intervals[row][0] <= left) {
                    left = intervals[row][0];
                }
            } else {
                temp[size++] = left;
                temp[size++] = right;

                left = intervals[row][0];
                right = intervals[row][1];
            }

            if (row == rows - 1) {
                temp[size++] = left;
                temp[size++] = right;
            }
        }

        int[][] result = new int[size / 2][2];

        for (int i = 0, j = 0; i < size; i += 2, j++) {
            result[j][0] = temp[i];
            result[j][1] = temp[i + 1];
        }

        return result;
    }
}
