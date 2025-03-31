package ru.somsin.leetcode.problems;

public class $_141_LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = slow.next;

        while (fast != null && (fast = fast.next) != null) {
            if (slow == fast) {
                return true;
            }

            slow = slow.next;
            fast = fast.next;
        }

        return false;
    }
}
