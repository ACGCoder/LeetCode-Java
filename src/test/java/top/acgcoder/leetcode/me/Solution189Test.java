package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution189;
import top.acgcoder.leetcode.best.BestSolution189;

import static org.junit.jupiter.api.Assertions.*;

class Solution189Test {

//    private final Solution189 solution189 = new MySolution189();
    private final Solution189 solution189 = new BestSolution189();

    @Test
    void rotate() {
        int[] nums = {1,2,3,4,5,6,7};
        int[] expected = {5,6,7,1,2,3,4};
        solution189.rotate(nums, 3);
        assertArrayEquals(expected, nums);
    }
}