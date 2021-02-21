package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution203;
import top.acgcoder.leetcode.best.BestSolution203;
import top.acgcoder.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class Solution203Test {

//    private final Solution203 solution203 = new MySolution203();
    private final Solution203 solution203 = new BestSolution203();

    @Test
    void removeElements1() {
        int[] nodeValues = new int[]{1, 2, 6, 3, 4, 5, 6};
        int val = 6;
        assertTrue(judgeValue(nodeValues, val));
    }

    @Test
    void removeElements2() {
        int[] nodeValues = new int[]{1, 2, 2, 1};
        int val = 2;
        assertTrue(judgeValue(nodeValues, val));
    }

    private boolean judgeValue(int[] nodeValues, int val){
        boolean result = true;
        ListNode current = null;

        for (int i = nodeValues.length - 1; i >= 0; i--) {
            current = new ListNode(nodeValues[i], current);
        }

        ListNode pointer = solution203.removeElements(current, val);

        while (pointer.next != null) {
            if (pointer.val == val) {
                result = false;
                break;
            }
            pointer = pointer.next;
        }

        return result;
    }
}