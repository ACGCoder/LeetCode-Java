package top.acgcoder.leetcode.common;

import java.util.ArrayList;

public class ListNodeUtils {
    public static ListNode arrayToNode(int[] nums) {
        ListNode node = null;
        for (int i = nums.length - 1; i >= 0; i--) {
            node = new ListNode(nums[i], node);
        }
        return node;
    }

    public static ListNode arrayToNode(int[] nums, int cycleIndex) {
        ListNode head = ListNodeUtils.arrayToNode(nums);
        if (cycleIndex >= 0 && cycleIndex < nums.length) {
            ListNode cycleNode = null, node = head;
            int i = 0;
            while (node.next != null) {
                if (i++ == cycleIndex)
                    cycleNode = node;
                node = node.next;
            }
            node.next = cycleNode;
        }
        return head;
    }

    public static int[] nodeToArray(ListNode node) {
        ArrayList<Integer> result = new ArrayList<>();
        while (node != null) {
            result.add(node.val);
            node = node.next;
        }
        return result.stream().mapToInt(e -> e).toArray();
    }
}
