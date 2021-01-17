package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution453;
import top.acgcoder.leetcode.best.BestSolution453;

import static org.junit.jupiter.api.Assertions.*;

class Solution453Test {

//    private Solution453 solution453 = new MySolution453();
    private Solution453 solution453 = new BestSolution453();

    @Test
    void minMoves() {
        int[] nums = {1,2,3};
        assertEquals(3, solution453.minMoves(nums));
    }
}