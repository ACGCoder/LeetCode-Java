package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution7;
import top.acgcoder.leetcode.best.BestSolution7;

import static org.junit.jupiter.api.Assertions.*;

class Solution7Test {

//    private Solution7 solution7 = new MySolution7();
    private Solution7 solution7 = new BestSolution7();

    @Test
    void reverse() {
        assertEquals(321, solution7.reverse(123));
        assertEquals(-321, solution7.reverse(-123));
        assertEquals(21, solution7.reverse(120));
        assertEquals(0, solution7.reverse(0));
        assertEquals(0, solution7.reverse(1534236469));
    }
}