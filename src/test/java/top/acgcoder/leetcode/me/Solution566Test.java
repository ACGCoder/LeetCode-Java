package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution566;

import static org.junit.jupiter.api.Assertions.*;

class Solution566Test {

    private final Solution566 solution566 = new MySolution566();

    @Test
    void matrixReshape() {
        int[][] nums = {{1,2},{3,4}};
        int r = 1, c = 4;
        int[][] expected = {{1,2,3,4}};
        assertArrayEquals(expected, solution566.matrixReshape(nums, r, c));
    }
}