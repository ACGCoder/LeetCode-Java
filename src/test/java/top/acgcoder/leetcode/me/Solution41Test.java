package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution41;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {
    private Solution41 solution41 = new MySolution41();

    @Test
    void firstMissingPositive1() {
        int[] nums = {1,2,0};
        assertEquals(3, solution41.firstMissingPositive(nums));
    }

    @Test
    void firstMissingPositive2() {
        int[] nums = {3,4,-1,1};
        assertEquals(2, solution41.firstMissingPositive(nums));
    }

    @Test
    void firstMissingPositive3() {
        int[] nums = {7,8,9,11,12};
        assertEquals(1, solution41.firstMissingPositive(nums));
    }

    @Test
    void firstMissingPositive4() {
        int[] nums = {1};
        assertEquals(2, solution41.firstMissingPositive(nums));
    }

    @Test
    void firstMissingPositive5() {
        int[] nums = {2};
        assertEquals(1, solution41.firstMissingPositive(nums));
    }
}