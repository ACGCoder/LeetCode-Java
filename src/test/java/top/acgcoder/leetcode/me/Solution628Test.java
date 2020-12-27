package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution628;

import static org.junit.jupiter.api.Assertions.*;

class Solution628Test {
    private Solution628 solution628 = new MySolution628();

    @Test
    void maximumProduct1() {
        int[] nums = {1,2,3};
        assertEquals(6, solution628.maximumProduct(nums));
    }
    @Test
    void maximumProduct2() {
        int[] nums = {1,2,3,4};
        assertEquals(24, solution628.maximumProduct(nums));
    }
    @Test
    void maximumProduct3() {
        int[] nums = {1000,1,1,1};
        assertEquals(1000, solution628.maximumProduct(nums));
    }
}