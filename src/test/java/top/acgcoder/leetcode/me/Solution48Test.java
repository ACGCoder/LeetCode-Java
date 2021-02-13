package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution48;
import top.acgcoder.leetcode.best.BestSolution48;

import static org.junit.jupiter.api.Assertions.*;

class Solution48Test {

//    private final Solution48 solution48 = new MySolution48();
    private final Solution48 solution48 = new BestSolution48();

    @Test
    void rotate1() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] expected = {{7,4,1},{8,5,2},{9,6,3}};
        solution48.rotate(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    void rotate2() {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int[][] expected = {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};
        solution48.rotate(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    void rotate3() {
        int[][] matrix = {{1}};
        int[][] expected = {{1}};
        solution48.rotate(matrix);
        assertArrayEquals(expected, matrix);
    }
}