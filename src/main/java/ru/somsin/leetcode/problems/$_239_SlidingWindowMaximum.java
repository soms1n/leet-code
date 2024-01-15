package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class $_239_SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new LinkedList<>();

        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            queue.add(num);

            if (queue.size() == k) {
                Integer max = queue.stream()
                        .max(Integer::compareTo)
                        .orElseThrow();

                result.add(max);

                queue.pop();
            }
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
