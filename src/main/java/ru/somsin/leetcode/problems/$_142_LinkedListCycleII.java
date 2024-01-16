package ru.somsin.leetcode.problems;

public class $_142_LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                slow = head;
                fast = fast.next;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return null;
    }
}
