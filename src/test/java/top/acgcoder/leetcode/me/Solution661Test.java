package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution661;

import static org.junit.jupiter.api.Assertions.*;

class Solution661Test {

    private Solution661 solution661 = new MySolution661();

    @Test
    void imageSmoother() {
        int[][] M = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] result = {{0,0,0,},{0,0,0},{0,0,0}};
        assertArrayEquals(result, solution661.imageSmoother(M));
    }
}