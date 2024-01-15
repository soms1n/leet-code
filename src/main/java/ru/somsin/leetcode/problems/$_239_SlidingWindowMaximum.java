package ru.somsin.leetcode.problems;

import java.util.Deque;
import java.util.LinkedList;

public class $_239_SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new LinkedList<>();

        int[] result = new int[nums.length - k + 1];
        int size = 0;

        for (int num : nums) {
            queue.add(num);

            if (queue.size() == k) {
                Integer max = queue.stream()
                        .max(Integer::compareTo)
                        .orElseThrow();

                result[size++] = max;

                queue.pop();
            }
        }

        return result;
    }
}
