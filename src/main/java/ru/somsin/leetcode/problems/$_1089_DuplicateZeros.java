package ru.somsin.leetcode.problems;

public class $_1089_DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int n = arr.length, zeroCount = 0;

        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            }
        }

        if (zeroCount == 0 || zeroCount == n) {
            return;
        }

        for (int left = n - 1, right = n - 1 + zeroCount; left >= 0 || right >= 0; left--, right--) {
            if (right < n) {
                arr[right] = arr[left];
            }

            if (arr[left] == 0) {
                right--;
                if (right < n) {
                    arr[right] = arr[left];
                }
            }
        }
    }
}
