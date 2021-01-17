package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution274;
import top.acgcoder.leetcode.best.BestSolution274;

import static org.junit.jupiter.api.Assertions.*;

class Solution274Test {
//    private Solution274 solution274 = new BestSolution274();
    private Solution274 solution274 = new MySolution274();

    @Test
    void hIndex1() {
        int[] nums = {3,0,6,1,5};
        assertEquals(3, solution274.hIndex(nums));
    }

    @Test
    void hIndex2() {
        int[] nums = {0,1};
        assertEquals(1, solution274.hIndex(nums));
    }
}