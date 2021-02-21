package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution682;

import static org.junit.jupiter.api.Assertions.*;

class Solution682Test {

    private final Solution682 solution682 = new MySolution682();

    @Test
    void calPoints1() {
        assertEquals(30, solution682.calPoints(new String[]{"5", "2", "C", "D", "+"}));
    }

    @Test
    void calPoints2() {
        assertEquals(27, solution682.calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}));
    }

    @Test
    void calPoints3() {
        assertEquals(1, solution682.calPoints(new String[]{"1"}));
    }
}