package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution303;
import top.acgcoder.leetcode.best.BestSolution303;

import static org.junit.jupiter.api.Assertions.*;

class Solution303Test {

    private Solution303 solution303;
    private final boolean useBest = true;

    @Test
    void sumRange() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        init(nums);

        assertEquals(1, solution303.sumRange(0, 2));
        assertEquals(-1, solution303.sumRange(2, 5));
        assertEquals(-3, solution303.sumRange(0, 5));
    }

    private void init(int[] nums){
        if(useBest)
            solution303 = new MySolution303(nums);
        else
            solution303 = new BestSolution303(nums);
    }
}