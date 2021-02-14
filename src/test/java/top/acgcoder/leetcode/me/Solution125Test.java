package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution125;

import static org.junit.jupiter.api.Assertions.*;

class Solution125Test {

    private final Solution125 solution125 = new MySolution125();

    @Test
    void isPalindrome() {
        assertTrue(solution125.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(solution125.isPalindrome("race a car"));
        assertFalse(solution125.isPalindrome("0P"));
        assertTrue(solution125.isPalindrome(",,P,"));
    }
}