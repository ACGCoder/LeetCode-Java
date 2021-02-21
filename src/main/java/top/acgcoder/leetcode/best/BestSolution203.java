package top.acgcoder.leetcode.best;

import top.acgcoder.leetcode.Solution203;
import top.acgcoder.leetcode.common.ListNode;

public class BestSolution203 implements Solution203 {
    @Override
    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;

        ListNode prev = sentinel, curr = head;
        while (curr != null) {
            if (curr.val == val) prev.next = curr.next;
            else prev = curr;
            curr = curr.next;
        }
        return sentinel.next;
    }
}
