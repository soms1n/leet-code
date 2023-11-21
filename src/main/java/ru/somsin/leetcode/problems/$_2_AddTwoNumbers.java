package ru.somsin.leetcode.problems;

public class $_2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return calculate(l1, l2, 0);
    }

    public ListNode calculate(ListNode l1, ListNode l2, int additionalValue) {
        if (l1 == null && l2 == null && additionalValue == 0) {
            return null;
        }

        int sum = additionalValue;
        sum += l1 == null ? 0 : l1.val;
        sum += l2 == null ? 0 : l2.val;

        return new ListNode(sum % 10, calculate(l1 == null ? null : l1.next, l2 == null ? null : l2.next, sum / 10));
    }
}
