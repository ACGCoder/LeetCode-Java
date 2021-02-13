package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution498;

import static org.junit.jupiter.api.Assertions.*;

class Solution498Test {

    private final Solution498 solution498 = new MySolution498();

    @Test
    void findDiagonalOrder() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[] expected = {1,2,4,7,5,3,6,8,9};
        assertArrayEquals(expected, solution498.findDiagonalOrder(matrix));
    }
}