package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution392;

import static org.junit.jupiter.api.Assertions.*;

class Solution392Test {

    private final Solution392 solution392 = new MySolution392();

    @Test
    void isSubsequence() {
        assertTrue(solution392.isSubsequence("abc", "ahbgdc"));
        assertFalse(solution392.isSubsequence("axc", "ahbgdc"));
    }
}