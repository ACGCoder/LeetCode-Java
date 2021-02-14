package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution14;

import static org.junit.jupiter.api.Assertions.*;

class Solution14Test {

    private final Solution14 solution14 = new MySolution14();

    @Test
    void longestCommonPrefix() {
        assertEquals("fl", solution14.longestCommonPrefix(new String[] {"flower","flow","flight"}));
        assertEquals("", solution14.longestCommonPrefix(new String[] {"dog","racecar","car"}));
    }
}