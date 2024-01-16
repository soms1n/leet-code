package ru.somsin.leetcode.problems;

public class $_74_SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, columns = matrix[0].length;

        int low = 0, high = rows * columns - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int value = matrix[mid / columns][mid % columns];

            if (value == target) {
                return true;
            } else if (value > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}
