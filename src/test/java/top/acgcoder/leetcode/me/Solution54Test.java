package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution54;
import top.acgcoder.leetcode.best.BestSolution54;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution54Test {

//    private final Solution54 solution54 = new MySolution54();
    private final Solution54 solution54 = new BestSolution54();

    @Test
    void spiralOrder() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> expected = Stream.of(1,2,3,6,9,8,7,4,5).collect(Collectors.toList());
        assertEquals(expected, solution54.spiralOrder(matrix));
    }
}