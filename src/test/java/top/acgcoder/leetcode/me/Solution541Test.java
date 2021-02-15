package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution541;
import top.acgcoder.leetcode.best.BestSolution541;

import static org.junit.jupiter.api.Assertions.*;

class Solution541Test {

//    private final Solution541 solution541 = new MySolution541();
    private final Solution541 solution541 = new BestSolution541();

    @Test
    void reverseStr() {
        assertEquals("bacdfeg", solution541.reverseStr("abcdefg", 2));
        assertEquals("cbadef", solution541.reverseStr("abcdef", 3));
        assertEquals("ba", solution541.reverseStr("ba", 1));
    }
}