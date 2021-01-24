package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution283;
import top.acgcoder.leetcode.best.BestSolution283;

import static org.junit.jupiter.api.Assertions.*;

class Solution283Test {

//    private Solution283 solution283 = new MySolution283();
    private Solution283 solution283 = new BestSolution283();

    @Test
    void moveZeroes1() {
        int[] nums = {0,1,0,3,12};
        solution283.moveZeroes(nums);
        assertArrayEquals(new int[]{1,3,12,0,0}, nums);
    }
    @Test
    void moveZeroes2() {
        int[] nums = {4,2,4,0,0,3,0,5,1,0};
        solution283.moveZeroes(nums);
        assertArrayEquals(new int[]{4,2,4,3,5,1,0,0,0,0}, nums);
    }
    @Test
    void moveZeroes3() {
        int[] nums = {0,1};
        solution283.moveZeroes(nums);
        assertArrayEquals(new int[]{1,0}, nums);
    }
}