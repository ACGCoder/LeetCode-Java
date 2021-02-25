package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution61;
import top.acgcoder.leetcode.best.BestSolution61;
import top.acgcoder.leetcode.common.ListNode;
import top.acgcoder.leetcode.common.ListNodeUtils;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution61Test {

    //    private final Solution61 solution61 = new MySolution61();
    private final Solution61 solution61 = new BestSolution61();

    @Test
    void rotateRight1() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, ListNodeUtils.nodeToArray(
                solution61.rotateRight(ListNodeUtils.arrayToNode(nums), 2)));
    }

    @Test
    void rotateRight2() {
        int[] nums = new int[]{0, 1, 2};
        assertArrayEquals(new int[]{2, 0, 1}, ListNodeUtils.nodeToArray(
                solution61.rotateRight(ListNodeUtils.arrayToNode(nums), 4)));
    }

    @Test
    void rotateRight3() {
        int[] nums = new int[]{1, 2};
        assertArrayEquals(new int[]{2, 1}, ListNodeUtils.nodeToArray(
                solution61.rotateRight(ListNodeUtils.arrayToNode(nums), 1)));
    }
}