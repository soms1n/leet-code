package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class $_986_IntervalListIntersections {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int firstIndex = 0, secondIndex = 0;
        List<int[]> result = new ArrayList<>();

        while (firstIndex < firstList.length && secondIndex < secondList.length) {
            int start = Math.max(firstList[firstIndex][0], secondList[secondIndex][0]);
            int end = Math.min(firstList[firstIndex][1], secondList[secondIndex][1]);

            if (start <= end) {
                result.add(new int[]{start, end});
            }

            if (end == firstList[firstIndex][1]) {
                firstIndex++;
            } else {
                secondIndex++;
            }
        }

        return result.toArray(new int[result.size()][2]);
    }
}
