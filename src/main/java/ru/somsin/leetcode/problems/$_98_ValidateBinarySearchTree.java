package ru.somsin.leetcode.problems;

public class $_98_ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    static public boolean dfs(TreeNode node, long minValue, long maxValue) {
        if (node == null) {
            return true;
        }

        if (node.val >= maxValue || node.val <= minValue) {
            return false;
        }

        return dfs(node.left, minValue, node.val) && dfs(node.right, node.val, maxValue);
    }
}
