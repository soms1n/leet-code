package ru.somsin.leetcode.problems;

public class $_1971_FindIfPathExistsInGraph {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        DSU dsu = new DSU(n);

        for (int[] edge : edges) {
            dsu.unite(edge[0], edge[1]);
        }

        return dsu.find(source) == dsu.find(destination);
    }

    public static class DSU {
        private final int[] tree;

        public DSU(int size) {
            tree = new int[size + 1];

            for (int value = 1; value < tree.length; value++) {
                makeSet(value);
            }
        }

        public void makeSet(int value) {
            tree[value] = value;
        }

        public int find(int value) {
            if (tree[value] == value) {
                return value;
            }

            return tree[value] = find(tree[value]);
        }

        public void unite(int value1, int value2) {
            int rootValue1 = find(value1);
            int rootValue2 = find(value2);

            tree[rootValue2] = rootValue1;
        }
    }
}
