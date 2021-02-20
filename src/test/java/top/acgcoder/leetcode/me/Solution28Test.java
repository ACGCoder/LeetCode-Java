package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution28;
import top.acgcoder.leetcode.best.BestSolution28;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

//    private final Solution28 solution28 = new MySolution28();
    private final Solution28 solution28 = new BestSolution28();

    @Test
    void strStr() {
        assertEquals(2, solution28.strStr("hello", "ll"));
        assertEquals(-1, solution28.strStr("aaaaa", "bba"));
        assertEquals(0, solution28.strStr("aaaaa", ""));
        assertEquals(-1, solution28.strStr("", "a"));
        assertEquals(0, solution28.strStr("", ""));
        assertEquals(4, solution28.strStr("mississippi", "issip"));
    }
}