package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution20;

import static org.junit.jupiter.api.Assertions.*;

class Solution20Test {

    private final Solution20 solution20 = new MySolution20();
    @Test
    void isValid() {
        assertTrue(solution20.isValid("()"));
        assertTrue(solution20.isValid("()[]{}"));
        assertTrue(solution20.isValid("{[]}"));
        assertFalse(solution20.isValid("(]"));
        assertFalse(solution20.isValid("([)]"));
        assertFalse(solution20.isValid("["));
        assertFalse(solution20.isValid("]"));
    }
}