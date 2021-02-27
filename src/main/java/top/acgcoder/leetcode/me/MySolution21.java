package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution21;
import top.acgcoder.leetcode.common.ListNode;

public class MySolution21 implements Solution21 {
    @Override
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head = l1.val <= l2.val ? l1 : l2;
        ListNode prev = new ListNode(0, head);

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                prev = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                prev = l2;
                l2 = l2.next;
            }
        }

        prev.next = l1 != null ? l1 : l2;
        return head;
    }
}
