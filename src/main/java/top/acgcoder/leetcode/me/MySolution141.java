package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution141;
import top.acgcoder.leetcode.common.ListNode;

public class MySolution141 implements Solution141 {
    @Override
    public boolean hasCycle(ListNode head) {
        ListNode prev = new ListNode(-1, head);
        ListNode slowPointer = prev;
        ListNode fastPointer = prev;
        while (fastPointer.next != null && fastPointer.next.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (slowPointer == fastPointer)
                return true;
        }
        return false;
    }
}
