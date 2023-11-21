package ru.somsin.leetcode.problems;

public class $_572_SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }

        return dfs(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean dfs(TreeNode node, TreeNode subNode) {
        if (node == null && subNode == null) {
            return true;
        } else if (node == null || subNode == null) {
            return false;
        } else if (node.val != subNode.val) {
            return false;
        }

        return dfs(node.left, subNode.left) && dfs(node.right, subNode.right);
    }
}
