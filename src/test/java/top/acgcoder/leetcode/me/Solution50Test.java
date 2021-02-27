package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution50;
import top.acgcoder.leetcode.best.BestSolution50;

import static org.junit.jupiter.api.Assertions.*;

class Solution50Test {

//    private Solution50 solution50 = new MySolution50();
    private Solution50 solution50 = new BestSolution50();

    @Test
    void myPow1() {
        assertEquals(1024.0, solution50.myPow(2.0, 10), 1e-4);
        assertEquals(9.2610, solution50.myPow(2.1, 3), 1e-4);
        assertEquals(0.25, solution50.myPow(2.0, -2), 1e-4);
    }

    @Test
    void myPow2() {
        assertEquals(0.0, solution50.myPow(0.00001, 2147483647), 1e-4);
    }
}