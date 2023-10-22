package ru.somsin.leetcode.problems.easy;

import java.util.Arrays;

public class $_1046_LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;

        if (n == 1) {
            return stones[0];
        }

        int right = stones.length - 1;

        for (int i = 0; i < n; i++) {
            Arrays.sort(stones);

            int y = stones[right];
            int x = stones[right - 1];

            if (x == 0) {
                return y;
            } else if (y == 0) {
                return x;
            }

            stones[right] = 0;
            stones[right - 1] = y == x ? 0 : y - x;
        }

        return 0;
    }
}
