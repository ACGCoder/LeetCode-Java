package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution58;

import static org.junit.jupiter.api.Assertions.*;

class Solution58Test {

    private final Solution58 solution58 = new MySolution58();

    @Test
    void lengthOfLastWord() {
        assertEquals(0, solution58.lengthOfLastWord(""));
        assertEquals(0, solution58.lengthOfLastWord(" "));
        assertEquals(5, solution58.lengthOfLastWord("Hello World"));
        assertEquals(1, solution58.lengthOfLastWord("a "));
    }
}