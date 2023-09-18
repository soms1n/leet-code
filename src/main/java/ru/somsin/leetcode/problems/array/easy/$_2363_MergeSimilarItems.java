package ru.somsin.leetcode.problems.array.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class $_2363_MergeSimilarItems {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> items = new TreeMap<>();

        putItems(items1, items);
        putItems(items2, items);

        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : items.entrySet()) {
            result.add(List.of(entry.getKey(), entry.getValue()));
        }

        return result;
    }

    private void putItems(int[][] items2, Map<Integer, Integer> items) {
        for (int[] item : items2) {
            items.put(item[0], items.getOrDefault(item[0], 0) + item[1]);
        }
    }
}
