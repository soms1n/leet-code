package ru.somsin.leetcode.problems;

public class $_2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return calculate(l1, l2, 0);
    }

    public ListNode calculate(ListNode l1, ListNode l2, int additionalValue) {
        if (l1 == null && l2 == null) {
            if (additionalValue > 0) {
                return new ListNode(additionalValue);
            }

            return null;
        }

        int sum = additionalValue;

        if (l1 != null) {
            sum += l1.val;
        }

        if (l2 != null) {
            sum += l2.val;
        }

        if (sum > 9) {
            additionalValue = 1;
            sum = sum % 10;
        } else {
            additionalValue = 0;
        }

        return new ListNode(sum, calculate(l1 == null ? null : l1.next, l2 == null ? null : l2.next, additionalValue));
    }
}
