package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution665;
import top.acgcoder.leetcode.best.BestSolution665;

import static org.junit.jupiter.api.Assertions.*;

class Solution665Test {

//    private Solution665 solution665 = new MySolution665();
    private Solution665 solution665 = new BestSolution665();

    @Test
    void checkPossibility1() {
        int[] nums = {4,2,3};
        assertTrue(solution665.checkPossibility(nums));
    }
    @Test
    void checkPossibility2() {
        int[] nums = {4,2,1};
        assertFalse(solution665.checkPossibility(nums));
    }
    @Test
    void checkPossibility3() {
        int[] nums = {5,7,1,8};
        assertTrue(solution665.checkPossibility(nums));
    }
    @Test
    void checkPossibility4() {
        int[] nums = {-1,4,2,3};
        assertTrue(solution665.checkPossibility(nums));
    }
    @Test
    void checkPossibility5() {
        int[] nums = {1,2,4,5,3};
        assertTrue(solution665.checkPossibility(nums));
    }
}