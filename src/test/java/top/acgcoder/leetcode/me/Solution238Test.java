package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution238;

import static org.junit.jupiter.api.Assertions.*;

class Solution238Test {

    private final Solution238 solution238 = new MySolution238();

    @Test
    void productExceptSelf() {
        int[] nums = {0,0};
        assertArrayEquals(nums, solution238.productExceptSelf(nums));
    }
}