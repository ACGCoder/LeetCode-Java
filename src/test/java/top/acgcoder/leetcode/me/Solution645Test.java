package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution645Test {

    @Test
    void findErrorNums1() {
        int[] nums = {1,2,2,4};
        Solution645 solution645 = new Solution645();
        assertArrayEquals(new int[]{2,3}, solution645.findErrorNums(nums));
    }
    @Test
    void findErrorNums2() {
        int[] nums = {3,2,2};
        Solution645 solution645 = new Solution645();
        assertArrayEquals(new int[]{2,1}, solution645.findErrorNums(nums));
    }
}