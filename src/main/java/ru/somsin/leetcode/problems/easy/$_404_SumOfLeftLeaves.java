package ru.somsin.leetcode.problems.easy;

public class $_404_SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, false);
    }

    private int dfs(TreeNode node, boolean isLeft) {
        if (node == null) {
            return 0;
        }

        if (isLeft && node.left == null && node.right == null) {
            return node.val;
        }

        return dfs(node.left, true) + dfs(node.right, false);
    }
}
