package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution396;
import top.acgcoder.leetcode.Solution628;
import top.acgcoder.leetcode.best.BestSolution396;

import static org.junit.jupiter.api.Assertions.*;

class Solution396Test {

//    private final Solution396 solution396 = new MySolution396();
    private final Solution396 solution396 = new BestSolution396();

    @Test
    void maxRotateFunction() {
        int[] A = {4,3,2,6};
        assertEquals(26, solution396.maxRotateFunction(A));
    }
}