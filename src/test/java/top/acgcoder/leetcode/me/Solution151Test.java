package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution151;
import top.acgcoder.leetcode.best.BestSolution151;

import static org.junit.jupiter.api.Assertions.*;

class Solution151Test {

    private final Solution151 solution151 = new MySolution151();
//    private final Solution151 solution151 = new BestSolution151();

    @Test
    void reverseWords() {
        assertEquals("blue is sky the", solution151.reverseWords("the sky is blue"));
        assertEquals("world! hello", solution151.reverseWords("  hello world!  "));
        assertEquals("example good a", solution151.reverseWords("a good   example"));
        assertEquals("Alice Loves Bob", solution151.reverseWords("  Bob    Loves  Alice   "));
        assertEquals("bob like even not does Alice", solution151.reverseWords("Alice does not even like bob"));
    }
}