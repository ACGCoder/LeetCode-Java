package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution141;
import top.acgcoder.leetcode.common.ListNodeUtils;

import static org.junit.jupiter.api.Assertions.*;

class Solution141Test {

    private Solution141 solution141 = new MySolution141();

    @Test
    void hasCycle1() {
        assertTrue(solution141.hasCycle(ListNodeUtils.arrayToNode(new int[]{3, 2, 0, -4}, 1)));
        assertTrue(solution141.hasCycle(ListNodeUtils.arrayToNode(new int[]{1, 2}, 0)));
        assertFalse(solution141.hasCycle(ListNodeUtils.arrayToNode(new int[]{1}, -1)));
    }

    @Test
    void hasCycle2() {
        assertFalse(solution141.hasCycle(ListNodeUtils.arrayToNode(new int[]{1, 2}, -1)));
        assertFalse(solution141.hasCycle(ListNodeUtils.arrayToNode(new int[]{21, 10, 17, 8, 4, 26, 5, 35, 33, -7, -16, 27, -12, 6, 29, -12, 5, 9, 20, 14, 14, 2, 13, -24, 21, 23, -21, 5}, -1)));
    }
}