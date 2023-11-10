package ru.somsin.leetcode.problems;

public class $_110_BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return root == null || dfs(root, 0) != -1;
    }

    private int dfs(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }

        depth++;

        int depthLeft = dfs(node.left, depth);
        int depthRight = dfs(node.right, depth);
        int depthNode = Math.abs(Math.abs(depthLeft - depthRight));

        if (depthLeft == -1 || depthRight == -1 || depthNode > 1) {
            return -1;
        }

        return Math.max(depthLeft, depthRight);
    }
}
