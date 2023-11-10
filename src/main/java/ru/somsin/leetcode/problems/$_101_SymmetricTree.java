package ru.somsin.leetcode.problems;

public class $_101_SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null || left.val != right.val || !dfs(left.left, right.right) || !dfs(left.right, right.left)) {
            return false;
        }

        return true;
    }
}
