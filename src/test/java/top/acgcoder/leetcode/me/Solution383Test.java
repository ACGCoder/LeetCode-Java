package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution383;
import top.acgcoder.leetcode.best.BestSolution383;

import static org.junit.jupiter.api.Assertions.*;

class Solution383Test {

//    private final Solution383 solution383 = new MySolution383();
    private final Solution383 solution383 = new BestSolution383();

    @Test
    void canConstruct() {
        assertTrue(solution383.canConstruct("aa", "aab"));
        assertFalse(solution383.canConstruct("a", "b"));
        assertFalse(solution383.canConstruct("aa", "ab"));
    }
}