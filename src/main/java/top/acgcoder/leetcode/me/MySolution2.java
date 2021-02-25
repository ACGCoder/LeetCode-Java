package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution2;
import top.acgcoder.leetcode.common.ListNode;

import java.math.BigInteger;

public class MySolution2 implements Solution2 {
    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder firstNumStr = new StringBuilder();
        StringBuilder secondNumStr = new StringBuilder();
        while (l1 != null) {
            firstNumStr.append(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            secondNumStr.append(l2.val);
            l2 = l2.next;
        }

        BigInteger result = new BigInteger(firstNumStr.reverse().toString())
                .add(new BigInteger(secondNumStr.reverse().toString()));
        String resultStr = result.toString();
        ListNode head = null;
        for (int i = 0; i < resultStr.length(); i++) {
            head = new ListNode(Integer.parseInt(String.valueOf(resultStr.charAt(i))), head);
        }

        return head;
    }
}
