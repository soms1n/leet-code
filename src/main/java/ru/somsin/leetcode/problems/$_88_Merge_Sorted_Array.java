package ru.somsin.leetcode.problems;

public class $_88_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }

        for (int tail = m + n - 1, index1 = 1, index2 = 1; tail >= 0; tail--) {
            int value1 = defineValue(nums1, m, index1);
            int value2 = defineValue(nums2, n, index2);

            if (value1 >= value2) {
                nums1[tail] = value1;
                index1++;
            } else {
                nums1[tail] = value2;
                index2++;
            }
        }
    }

    private int defineValue(int[] values, int length, int index) {
        return length - index >= 0 ? values[length - index] : Integer.MIN_VALUE;
    }
}
