package ru.somsin.leetcode.problems;

public class $_42_TrappingRainWater {
    public int trap(int[] height) {
        int length = height.length, result = 0;

        for (int i = 0; i < length; i++) {
            int h = height[i];

            for (int j = 1; j <= h; j++) {
                if (i < length - 1 && j <= height[i + 1]) {
                    continue;
                }

                for (int k = i + 1; k < length; k++) {
                    if (height[k] >= j) {
                        result += k - i - 1;
                        break;
                    }
                }
            }
        }

        return result;
    }
}
