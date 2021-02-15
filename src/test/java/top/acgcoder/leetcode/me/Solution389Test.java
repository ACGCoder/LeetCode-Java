package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution389;
import top.acgcoder.leetcode.best.BestSolution389;

import static org.junit.jupiter.api.Assertions.*;

class Solution389Test {

//    private final Solution389 solution389 = new MySolution389();
    private final Solution389 solution389 = new BestSolution389();

    @Test
    void findTheDifference() {
        assertEquals('e', solution389.findTheDifference("abcd", "abcde"));
        assertEquals('y', solution389.findTheDifference("", "y"));
        assertEquals('a', solution389.findTheDifference("a", "aa"));
        assertEquals('a', solution389.findTheDifference("ae", "aea"));
    }
}