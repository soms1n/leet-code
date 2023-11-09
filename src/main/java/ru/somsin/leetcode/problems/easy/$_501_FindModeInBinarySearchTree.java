package ru.somsin.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $_501_FindModeInBinarySearchTree {
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> counter = new HashMap<>();

        int max = dfs(root, counter, 0);

        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == max) {
                result.add(entry.getKey());
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private int dfs(TreeNode node, Map<Integer, Integer> counter, int max) {
        if (node == null) {
            return 0;
        }

        int numbers = counter.getOrDefault(node.val, 0) + 1;

        if (numbers > max) {
            max = numbers;
        }

        counter.put(node.val, numbers);

        int maxLeft = dfs(node.left, counter, numbers);
        int maxRight = dfs(node.right, counter, numbers);

        return Math.max(Math.max(maxLeft, maxRight), max);
    }
}
