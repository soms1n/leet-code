package ru.somsin.leetcode.problems;

public class $_2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode next = result;

        int additionalValue = 0, sum = 0;

        while (l1 != null || l2 != null || additionalValue > 0) {
            sum = additionalValue;
            sum += l1 == null ? 0 : l1.val;
            sum += l2 == null ? 0 : l2.val;

            additionalValue = sum / 10;

            next.next = new ListNode(sum % 10);

            next = next.next;
            l1 = l1 != null && l1.next != null ? l1.next : null;
            l2 = l2 != null && l2.next != null ? l2.next : null;
        }

        return result.next;
    }
}
