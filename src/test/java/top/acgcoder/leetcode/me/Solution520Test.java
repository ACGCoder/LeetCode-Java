package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution520;
import top.acgcoder.leetcode.best.BestSolution520;

import static org.junit.jupiter.api.Assertions.*;

class Solution520Test {

//    private final Solution520 solution520 = new MySolution520();
    private final Solution520 solution520 = new BestSolution520();

    @Test
    void detectCapitalUse() {
        assertTrue(solution520.detectCapitalUse("USA"));
        assertFalse(solution520.detectCapitalUse("FlaG"));
    }
}