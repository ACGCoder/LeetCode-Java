package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution304;

import static org.junit.jupiter.api.Assertions.*;

class Solution304Test {

    private Solution304 solution304;

    @Test
    void sumRange() {
        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        init(matrix);

        assertEquals(8, solution304.sumRegion(2, 1, 4, 3));
        assertEquals(11, solution304.sumRegion(1, 1, 2, 2));
        assertEquals(12, solution304.sumRegion(1, 2, 2, 4));
    }

    private void init(int[][] matrix){
        solution304 = new MySolution304(matrix);
    }
}