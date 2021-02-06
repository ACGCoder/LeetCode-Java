package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution598;

import static org.junit.jupiter.api.Assertions.*;

class Solution598Test {

    private Solution598 solution598 = new MySolution598();

    @Test
    void maxCount() {
        int[][] ops = {{2,2},{3,3}};
        assertEquals(4, solution598.maxCount(3,3, ops));
    }
}