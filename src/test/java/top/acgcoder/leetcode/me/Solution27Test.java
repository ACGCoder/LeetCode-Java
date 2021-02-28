package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution27;
import top.acgcoder.leetcode.best.BestSolution27;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

//    private Solution27 solution27 = new MySolution27();
    private Solution27 solution27 = new BestSolution27();

    @Test
    void removeElement1() {
        assertEquals(2, solution27.removeElement(new int[]{3, 2, 2, 3}, 3));
        assertEquals(5, solution27.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
        assertEquals(0, solution27.removeElement(new int[]{}, 2));
        assertEquals(0, solution27.removeElement(new int[]{1}, 1));
        assertEquals(0, solution27.removeElement(new int[]{3, 3}, 3));
    }

    @Test
    void removeElement2() {
        assertEquals(2, solution27.removeElement(new int[]{3, 3}, 5));
    }
}