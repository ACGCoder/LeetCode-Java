package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution482;
import top.acgcoder.leetcode.best.BestSolution482;

import static org.junit.jupiter.api.Assertions.*;

class Solution482Test {

//    private final Solution482 solution482 = new MySolution482();
    private final Solution482 solution482 = new BestSolution482();

    @Test
    void licenseKeyFormatting() {
        assertEquals("5F3Z-2E9W", solution482.licenseKeyFormatting("5F3Z-2e-9-w", 4));
        assertEquals("2-5G-3J", solution482.licenseKeyFormatting("2-5g-3-J", 2));
        assertEquals("AA-AA", solution482.licenseKeyFormatting("--a-a-a-a--", 2));
        assertEquals("", solution482.licenseKeyFormatting("---", 3));
    }
}