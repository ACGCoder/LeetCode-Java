package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution242;
import top.acgcoder.leetcode.best.BestSolution242;

import static org.junit.jupiter.api.Assertions.*;

class Solution242Test {

//    private final Solution242 solution242 = new MySolution242();
    private final Solution242 solution242 = new BestSolution242();

    @Test
    void isAnagram() {
        assertTrue(solution242.isAnagram("anagram", "nagaram"));
        assertFalse(solution242.isAnagram("rat", "car"));
    }
}