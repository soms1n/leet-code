package ru.somsin.leetcode.problems;

public class $_1394_FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        int[] counter = new int[501];

        for (int value : arr) {
            counter[value]++;
        }

        for (int i = 500; i > 0; i--) {
            if (counter[i] == i) {
                return i;
            }
        }

        return -1;
    }
}
