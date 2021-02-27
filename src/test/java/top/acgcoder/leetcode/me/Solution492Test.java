package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution492;
import top.acgcoder.leetcode.best.BestSolution492;

import static org.junit.jupiter.api.Assertions.*;

class Solution492Test {

//    private Solution492 solution492 = new MySolution492();
    private Solution492 solution492 = new BestSolution492();

    @Test
    void constructRectangle() {
        assertArrayEquals(new int[]{2, 2}, solution492.constructRectangle(4));
        assertArrayEquals(new int[]{6, 5}, solution492.constructRectangle(30));
    }
}