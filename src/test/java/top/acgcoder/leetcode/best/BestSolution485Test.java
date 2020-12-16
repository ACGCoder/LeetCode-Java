package top.acgcoder.leetcode.best;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.me.Solution485;

import static org.junit.jupiter.api.Assertions.*;

class BestSolution485Test {

    @Test
    void findMaxConsecutiveOnes() {
        BestSolution485 solution485 = new BestSolution485();
        int[] nums1 = {1,1,0,1,1,1};
        assertEquals(3,solution485.findMaxConsecutiveOnes(nums1));

        int[] nums2 = {1,1,0,0,1,0};
        assertEquals(2,solution485.findMaxConsecutiveOnes(nums2));

        int[] nums3 = {0,1,0,1,1,0};
        assertEquals(2,solution485.findMaxConsecutiveOnes(nums3));

        int[] nums4 = {0,0,0,0,0,0};
        assertEquals(0,solution485.findMaxConsecutiveOnes(nums4));

        int[] nums5 = {1,1,1,1,1,1};
        assertEquals(6,solution485.findMaxConsecutiveOnes(nums5));
    }
}