package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution203;
import top.acgcoder.leetcode.common.ListNode;

public class MySolution203 implements Solution203 {
    @Override
    public ListNode removeElements(ListNode head, int val) {
        while (head != null) {
            if (head.val == val) {
                head = head.next;
            } else {
                break;
            }
        }
        ListNode pointer = head;
        while (pointer != null && pointer.next != null) {
            while (pointer.next != null && pointer.next.val == val)
                pointer.next = pointer.next.next;
            pointer = pointer.next;
        }
        return head;
    }
}

