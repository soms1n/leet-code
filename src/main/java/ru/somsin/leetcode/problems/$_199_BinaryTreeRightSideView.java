package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class $_199_BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> deep = new HashSet<>();

        dfs(root, result, deep, 0);

        return result;
    }

    public void dfs(TreeNode node, List<Integer> result, Set<Integer> deep, int level) {
        if (node == null) {
            return;
        }

        if (!deep.contains(level)) {
            result.add(node.val);
            deep.add(level);
        }

        level++;

        if (node.right != null) {
            dfs(node.right, result, deep, level);
        }

        if (node.left != null) {
            dfs(node.left, result, deep, level);
        }
    }
}
