package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution419;

import static org.junit.jupiter.api.Assertions.*;

class Solution419Test {

    private Solution419 solution419 = new MySolution419();

    @Test
    void countBattleships() {
        char[][] board = {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
        assertEquals(2, solution419.countBattleships(board));
    }
}