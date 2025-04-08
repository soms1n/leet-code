package ru.somsin.leetcode.problems;

public class $_832_FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length, m = image[0].length;

        for (int row = 0; row < n; row++) {
            for (int left = 0, right = m - 1; left <= right; left++, right--) {
                int temp = invert(image[row][left]);
                image[row][left] = invert(image[row][right]);
                image[row][right] = temp;
            }
        }

        return image;
    }

    private int invert(int bit) {
        return bit == 1 ? 0 : 1;
    }
}
