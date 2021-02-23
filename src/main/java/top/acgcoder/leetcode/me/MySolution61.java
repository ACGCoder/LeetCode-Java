package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution61;
import top.acgcoder.leetcode.common.ListNode;

public class MySolution61 implements Solution61 {
    @Override
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return null;

        int len = 1, count = 0;
        ListNode curr = head;
        while (curr.next != null) {
            len += 1;
            curr = curr.next;
        }

        k %= len;
        if (k == 0)
            return head;

        curr.next = head;
        while (count != len - k){
            curr = curr.next;
            count++;
        }
        head = curr.next;
        curr.next = null;

        return head;
    }
}
