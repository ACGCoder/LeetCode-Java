package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution414Test {

    @Test
    void thirdMax1() {
        int[] nums = {3,2,1};
        Solution414 solution414 = new Solution414();
        assertEquals(1, solution414.thirdMax(nums));
    }
    @Test
    void thirdMax2() {
        int[] nums = {1,2};
        Solution414 solution414 = new Solution414();
        assertEquals(2, solution414.thirdMax(nums));
    }
    @Test
    void thirdMax3() {
        int[] nums = {2,2,3,1};
        Solution414 solution414 = new Solution414();
        assertEquals(1, solution414.thirdMax(nums));
    }
}