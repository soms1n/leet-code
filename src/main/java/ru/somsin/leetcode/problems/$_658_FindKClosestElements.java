package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class $_658_FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0, right = arr.length - 1;

        while (right - left >= k) {
            if (arr[right] - x < x - arr[left]) {
                left++;
            } else {
                right--;
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}
