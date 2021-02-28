package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution345;

import static org.junit.jupiter.api.Assertions.*;

class Solution345Test {

    private Solution345 solution345 = new MySolution345();

    @Test
    void reverseVowels() {
        assertEquals("holle", solution345.reverseVowels("hello"));
        assertEquals("leotcede", solution345.reverseVowels("leetcode"));
        assertEquals("Aa", solution345.reverseVowels("aA"));
        assertEquals(".,", solution345.reverseVowels(".,"));
    }
}