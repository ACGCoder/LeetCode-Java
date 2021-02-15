package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution557;

import static org.junit.jupiter.api.Assertions.*;

class Solution557Test {

    private final Solution557 solution557 = new MySolution557();

    @Test
    void reverseWords() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", solution557.reverseWords("Let's take LeetCode contest"));
        assertEquals("", solution557.reverseWords(""));
    }
}