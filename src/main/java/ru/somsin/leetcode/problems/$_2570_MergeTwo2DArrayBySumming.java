package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class $_2570_MergeTwo2DArrayBySumming {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<Integer> sumNumbers = new ArrayList<>();
        int leftValue = 0, rightValue = 0, leftIndex = 0, rightIndex = 0;

        for (int left = 0, right = 0; left < nums1.length || right < nums2.length; ) {
            if (left < nums1.length) {
                leftIndex = nums1[left][0];
                leftValue = nums1[left][1];
            } else {
                leftIndex = Integer.MAX_VALUE;
            }

            if (right < nums2.length) {
                rightIndex = nums2[right][0];
                rightValue = nums2[right][1];
            } else {
                rightIndex = Integer.MAX_VALUE;
            }

            if (leftIndex == rightIndex) {
                sumNumbers.add(leftIndex);
                sumNumbers.add(leftValue + rightValue);
                left++;
                right++;
            } else if (leftIndex > rightIndex) {
                sumNumbers.add(rightIndex);
                sumNumbers.add(rightValue);
                right++;
            } else {
                sumNumbers.add(leftIndex);
                sumNumbers.add(leftValue);
                left++;
            }
        }

        int[][] result = new int[sumNumbers.size() / 2][2];

        for (int i = 0, j = 0; i < result.length; i++, j += 2) {
            result[i][0] = sumNumbers.get(j);
            result[i][1] = sumNumbers.get(j + 1);
        }

        return result;
    }
}
