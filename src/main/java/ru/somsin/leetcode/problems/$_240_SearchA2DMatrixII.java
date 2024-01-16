package ru.somsin.leetcode.problems;

public class $_240_SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] values : matrix) {
            int left = 0, right = values.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                int midValue = values[mid];

                if (midValue == target) {
                    return true;
                } else if (midValue > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return false;
    }
}
