package top.acgcoder.leetcode.best;

import top.acgcoder.leetcode.Solution61;
import top.acgcoder.leetcode.common.ListNode;

public class BestSolution61 implements Solution61 {
    @Override
    public ListNode rotateRight(ListNode head, int k) {
        // base cases
        if (head == null) return null;
        if (head.next == null) return head;

        // close the linked list into the ring
        ListNode old_tail = head;
        int n;
        for(n = 1; old_tail.next != null; n++)
            old_tail = old_tail.next;
        old_tail.next = head;

        // find new tail : (n - k % n - 1)th node
        // and new head : (n - k % n)th node
        ListNode new_tail = head;
        for (int i = 1; i < n - k % n; i++)
            new_tail = new_tail.next;
        ListNode new_head = new_tail.next;

        // break the ring
        new_tail.next = null;

        return new_head;
    }
}
