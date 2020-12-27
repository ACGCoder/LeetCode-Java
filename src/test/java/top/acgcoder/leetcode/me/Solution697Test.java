package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution697;
import top.acgcoder.leetcode.best.BestSolution697;

import static org.junit.jupiter.api.Assertions.*;

class Solution697Test {
    private Solution697 solution697 = new BestSolution697();
//    private Solution697 solution697 = new MySolution697();

    @Test
    void findShortestSubArray1() {
        int[] nums = {1,2,2,3,1};
        assertEquals(2, solution697.findShortestSubArray(nums));
    }
    @Test
    void findShortestSubArray2() {
        int[] nums = {1,2,2,3,1,4,2};
        assertEquals(6, solution697.findShortestSubArray(nums));
    }
}