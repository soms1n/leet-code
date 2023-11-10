package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class $_501_FindModeInBinarySearchTree {
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> counter = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        int max = 0;

        while (!stack.empty()) {
            TreeNode node = stack.pop();

            int numbers = counter.getOrDefault(node.val, 0) + 1;

            if (numbers > max) {
                max = numbers;
            }

            counter.put(node.val, numbers);

            if (node.left != null) {
                stack.push(node.left);
            }

            if (node.right != null) {
                stack.push(node.right);
            }
        }

        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == max) {
                result.add(entry.getKey());
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
