package ru.somsin.leetcode.problems.graph.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $_133_CloneGraph {
    private final Map<Integer, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        if (visited.containsKey(node.val)) {
            return visited.get(node.val);
        }

        Node copyNode = new Node(node.val);
        visited.put(node.val, copyNode);

        if (!node.neighbors.isEmpty()) {
            node.neighbors.forEach(neighbor -> copyNode.neighbors.add(cloneGraph(neighbor)));
        }

        return copyNode;
    }

    static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, List<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}