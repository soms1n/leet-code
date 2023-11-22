package ru.somsin.leetcode.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class $_56_MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        LinkedList<int[]> result = new LinkedList<>();

        for (int[] interval : intervals) {
            if (result.isEmpty() || interval[0] > result.getLast()[1]) {
                result.add(interval);
            } else {
                result.getLast()[1] = Math.max(result.getLast()[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
