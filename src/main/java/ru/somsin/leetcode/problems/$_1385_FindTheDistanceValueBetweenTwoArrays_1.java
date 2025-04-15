package ru.somsin.leetcode.problems;

import java.util.Arrays;

public class $_1385_FindTheDistanceValueBetweenTwoArrays_1 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);

        int result = 0;

        for (int num : arr1) {
            if (isNotFound(arr2, num - d, num + d)) {
                result++;
            }
        }

        return result;
    }

    private boolean isNotFound(int[] arr, int from, int to) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] >= from && arr[mid] <= to) {
                return false;
            } else if (arr[mid] < from) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return true;
    }
}
