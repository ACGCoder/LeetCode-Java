package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution442;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution442Test {
    private Solution442 solution442 = new MySolution442();

    @Test
    void findDuplicates() {
        int[] nums = {4,3,2,7,8,2,3,1};
        Set<Integer> expectedSet = Stream.of(2,3).collect(Collectors.toSet());
        Set<Integer> actualSet = new HashSet<>(solution442.findDuplicates(nums));
        assertEquals(expectedSet, actualSet);
    }
}