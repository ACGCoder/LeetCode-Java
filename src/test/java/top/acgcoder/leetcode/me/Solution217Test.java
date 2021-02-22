package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution217;

import static org.junit.jupiter.api.Assertions.*;

class Solution217Test {

    private final Solution217 solution217 = new MySolution217();

    @Test
    void containsDuplicate() {
        assertTrue(solution217.containsDuplicate(new int[]{1, 2, 3, 1}));
        assertFalse(solution217.containsDuplicate(new int[]{1, 2, 3, 4}));
        assertTrue(solution217.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}