package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution66;

import static org.junit.jupiter.api.Assertions.*;

class Solution66Test {

    private final Solution66 solution66 = new MySolution66();

    @Test
    void plusOne1() {
        assertArrayEquals(new int[]{1, 2, 4}, solution66.plusOne(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{4, 3, 2, 2}, solution66.plusOne(new int[]{4, 3, 2, 1}));
        assertArrayEquals(new int[]{1}, solution66.plusOne(new int[]{0}));
    }
    @Test
    void plusOne2() {
        assertArrayEquals(new int[]{1,0}, solution66.plusOne(new int[]{9}));
    }
}