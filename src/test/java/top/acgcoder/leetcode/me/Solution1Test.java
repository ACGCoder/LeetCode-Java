package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution1;
import top.acgcoder.leetcode.Solution61;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    private final Solution1 solution1 = new MySolution1();

    @Test
    void twoSum() {
        assertArrayEquals(new int[]{0, 1}, solution1.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, solution1.twoSum(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{0, 1}, solution1.twoSum(new int[]{3, 3}, 6));
    }
}