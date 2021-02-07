package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution59;
import top.acgcoder.leetcode.best.BestSolution59;

import static org.junit.jupiter.api.Assertions.*;

class Solution59Test {

    private Solution59 solution59 = new MySolution59();
//    private Solution59 solution59 = new BestSolution59();

    @Test
    void generateMatrix1() {
        int[][] expected = {{1,2,3},{8,9,4},{7,6,5}};
        assertArrayEquals(expected, solution59.generateMatrix(3));
    }   @Test
    void generateMatrix2() {
        int[][] expected = {{1,2},{4,3}};
        assertArrayEquals(expected, solution59.generateMatrix(2));
    }
}