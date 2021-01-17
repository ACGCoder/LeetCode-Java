package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution448Test {
    private Solution448 solution448 = new MySolution448();

    @Test
    void findDisappearedNumbers() {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> list = Stream.of(5,6).collect(Collectors.toList());
        assertEquals(list, solution448.findDisappearedNumbers(nums));
    }
}