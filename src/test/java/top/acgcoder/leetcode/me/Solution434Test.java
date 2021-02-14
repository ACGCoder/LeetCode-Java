package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution434;

import static org.junit.jupiter.api.Assertions.*;

class Solution434Test {

    private final Solution434 solution434 = new MySolution434();

    @Test
    void countSegments() {
        assertEquals(5, solution434.countSegments("Hello, my name is John"));
    }
}