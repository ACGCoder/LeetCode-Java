package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution73;
import top.acgcoder.leetcode.best.BestSolution73;

import static org.junit.jupiter.api.Assertions.*;

class Solution73Test {

//    private final Solution73 solution73 = new MySolution73();
    private final Solution73 solution73 = new BestSolution73();

    @Test
    void setZeroes1() {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] expected = {{1,0,1},{0,0,0},{1,0,1}};
        solution73.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }
    @Test
    void setZeroes2() {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] expected = {{0,0,0,0},{0,4,5,0},{0,3,1,0}};
        solution73.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }
}