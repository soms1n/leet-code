package ru.somsin.leetcode.problems;

public class $_1385_FindTheDistanceValueBetweenTwoArrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int result = 0;

        for (int val1 : arr1) {
            boolean skip = false;

            for (int val2 : arr2) {
                if (Math.abs(val1 - val2) <= d) {
                    skip = true;
                    break;
                }
            }

            if (!skip) {
                result++;
            }
        }

        return result;
    }
}
