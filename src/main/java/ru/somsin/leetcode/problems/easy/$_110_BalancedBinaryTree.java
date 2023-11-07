package ru.somsin.leetcode.problems.easy;

public class $_110_BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return root == null || Math.abs(dfs(root.left, 0) - dfs(root.right, 0)) < 2;
    }

    private int dfs(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }

        depth++;

        return Math.max(dfs(node.left, depth), dfs(node.right, depth));
    }
}
