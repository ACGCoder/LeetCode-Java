package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution289;
import top.acgcoder.leetcode.best.BestSolution289;

import static org.junit.jupiter.api.Assertions.*;

class Solution289Test {

//    private final Solution289 solution289 = new MySolution289();
    private final Solution289 solution289 = new BestSolution289();

    @Test
    void gameOfLife() {
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        int[][] expected = {{0,0,0},{1,0,1},{0,1,1},{0,1,0}};
        solution289.gameOfLife(board);
        assertArrayEquals(expected, board);
    }
}