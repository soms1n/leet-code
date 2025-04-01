package ru.somsin.leetcode.problems;

public class $_234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;

            if (fast.next.next == null) {
                fast = fast.next;
            } else {
                fast = fast.next.next;
            }
        }

        ListNode prev = slow;
        slow = slow.next;
        prev.next = null;

        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        slow = head;

        while (slow.next != null) {
            if (slow.val != fast.val) {
                return false;
            }

            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }
}
