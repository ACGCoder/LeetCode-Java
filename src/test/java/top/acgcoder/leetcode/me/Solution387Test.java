package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution387;

import static org.junit.jupiter.api.Assertions.*;

class Solution387Test {

    private final Solution387 solution387 = new MySolution387();

    @Test
    void firstUniqChar() {
        assertEquals(0, solution387.firstUniqChar("leetcode"));
        assertEquals(2, solution387.firstUniqChar("loveleetcode"));
        assertEquals(-1, solution387.firstUniqChar("ll"));
        assertEquals(-1, solution387.firstUniqChar("aadadaad"));
    }
}