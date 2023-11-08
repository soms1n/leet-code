package ru.somsin.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class $_145_BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        dfs(root, result);

        return result;
    }

    private void dfs(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        dfs(node.left, result);
        dfs(node.right, result);

        result.add(node.val);
    }
}
