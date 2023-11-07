package ru.somsin.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class $_94_BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        dfs(root, result);

        return result;
    }

    public void dfs(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        dfs(node.left, result);

        result.add(node.val);

        dfs(node.right, result);
    }
}
