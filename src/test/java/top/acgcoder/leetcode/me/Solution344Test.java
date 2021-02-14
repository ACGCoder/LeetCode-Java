package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution344;

import static org.junit.jupiter.api.Assertions.*;

class Solution344Test {

    private final Solution344 solution344 = new MySolution344();

    @Test
    void reverseString() {
        char[] s = {'h','e','l','l','o'};
        solution344.reverseString(s);
        assertArrayEquals(new char[] {'o','l','l','e','h'}, s);
    }
}