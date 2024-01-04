package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class $_199_BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        dfs(root, result, 0);

        return result;
    }

    public void dfs(TreeNode node, List<Integer> result, int level) {
        if (node == null) {
            return;
        }

        if (level++ == result.size()) {
            result.add(node.val);
        }

        dfs(node.right, result, level);
        dfs(node.left, result, level);
    }
}
