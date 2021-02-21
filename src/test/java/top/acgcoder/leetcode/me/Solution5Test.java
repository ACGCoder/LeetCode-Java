package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution5;
import top.acgcoder.leetcode.best.BestSolution5;

import static org.junit.jupiter.api.Assertions.*;

class Solution5Test {

    private final Solution5 solution5 = new MySolution5();
//    private final Solution5 solution5 = new BestSolution5();

    @Test
    void longestPalindrome1() {
        String result = solution5.longestPalindrome("babad");
        assertTrue("bab".equals(result) || "aba".equals(result));
    }

    @Test
    void longestPalindrome2() {
        assertEquals("bb", solution5.longestPalindrome("cbbd"));
        assertEquals("a", solution5.longestPalindrome("a"));
        assertEquals("bb", solution5.longestPalindrome("bb"));
        assertEquals("bacab", solution5.longestPalindrome("bacabab"));
    }

    @Test
    void longestPalindrome3() {
        String result = solution5.longestPalindrome("ac");
        assertTrue("a".equals(result) || "c".equals(result));
    }
}