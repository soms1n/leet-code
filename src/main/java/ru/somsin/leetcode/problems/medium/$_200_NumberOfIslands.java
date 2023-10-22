package ru.somsin.leetcode.problems.medium;

import java.util.HashSet;
import java.util.Set;

public class $_200_NumberOfIslands {
    public int numIslands(char[][] grid) {
        int n = grid.length, m = grid[0].length;

        DSU dsu = new DSU(n * m);

        for (int row = 0, offsetRow = 0; row < n; row++, offsetRow += m) {
            for (int column = 0, offsetColumn = 1; column < m; column++, offsetColumn++) {
                if (grid[row][column] == '0') {
                    continue;
                }

                int index = offsetRow + offsetColumn;

                dsu.add(index);

                if (row - 1 >= 0 && grid[row - 1][column] == '1') {
                    dsu.union(index - m, index);
                }

                if (column - 1 >= 0 && grid[row][column - 1] == '1') {
                    dsu.union(index - 1, index);
                }
            }
        }

        return dsu.size();
    }

    public static class DSU {
        private final int[] tree;

        public DSU(int size) {
            tree = new int[size + 1];
        }

        public void add(int value) {
            tree[value] = value;
        }

        public int find(int value) {
            if (tree[value] == value) {
                return value;
            }

            return tree[value] = find(tree[value]);
        }

        public void union(int value1, int value2) {
            tree[find(value2)] = find(value1);
        }

        public int size() {
            Set<Integer> counter = new HashSet<>();

            for (int i = 0; i < tree.length; i++) {
                if (tree[i] != 0 && tree[i] == i) {
                    counter.add(tree[i]);
                }
            }

            return counter.size();
        }
    }
}
