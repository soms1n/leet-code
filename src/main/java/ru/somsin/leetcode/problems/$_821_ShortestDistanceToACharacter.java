package ru.somsin.leetcode.problems;

public class $_821_ShortestDistanceToACharacter {
    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];

        ListNode root = new ListNode(-1);
        ListNode next = root;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                next.next = new ListNode(i);
                next = next.next;
            }
        }

        if (root.next == null) {
            return null;
        }

        next = root.next;

        for (int i = 0; i < s.length(); i++) {
            if (next.next != null && Math.abs(i - next.position) > Math.abs(i - next.next.position)) {
                next = next.next;
            }

            result[i] = Math.abs(i - next.position);
        }

        return result;
    }

    private static class ListNode {
        int position;
        ListNode next;

        ListNode(int position) {
            this.position = position;
        }
    }
}
