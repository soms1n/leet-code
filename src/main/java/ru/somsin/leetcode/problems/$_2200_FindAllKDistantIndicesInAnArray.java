package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class $_2200_FindAllKDistantIndicesInAnArray {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> keyPosition = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                keyPosition.add(i);
            }
        }

        if (keyPosition.isEmpty()) {
            return null;
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j : keyPosition) {
                if (Math.abs(i - j) <= k) {
                    result.add(i);
                    break;
                }
            }
        }

        return result;
    }
}
