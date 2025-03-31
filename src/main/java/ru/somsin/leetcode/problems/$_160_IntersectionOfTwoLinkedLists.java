package ru.somsin.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class $_160_IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<>();

        while (headA != null || headB != null) {
            if (headA != null) {
                if (visited.contains(headA)) {
                    return headA;
                } else {
                    visited.add(headA);
                    headA = headA.next;
                }
            }

            if (headB != null) {
                if (visited.contains(headB)) {
                    return headB;
                } else {
                    visited.add(headB);
                    headB = headB.next;
                }
            }
        }

        return null;
    }
}
