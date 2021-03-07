package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution102;
import top.acgcoder.leetcode.common.TreeNodeUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution102Test {

    private final Solution102 solution102 = new MySolution102();

    @Test
    void levelOrder1() {
        int[][] numbers = {{3}, {9, 20}, {15, 7}};
        List<List<Integer>> expected = Arrays.stream(numbers)
                .map(e -> Arrays.stream(e).boxed().collect(Collectors.toList())).collect(Collectors.toList());
        assertEquals(expected, solution102.levelOrder(TreeNodeUtils.arrayToTreeNode(new Integer[]{3, 9, 20, null, null, 15, 7})));
    }

    @Test
    void levelOrder2() {
        int[][] numbers = {{1}, {2, 3}, {4, 5}};
        List<List<Integer>> expected = Arrays.stream(numbers)
                .map(e -> Arrays.stream(e).boxed().collect(Collectors.toList())).collect(Collectors.toList());
        assertEquals(expected, solution102.levelOrder(TreeNodeUtils.arrayToTreeNode(new Integer[]{1, 2, 3, 4, null, null, 5})));
    }

    @Test
    void levelOrder3() {
        int[][] numbers = {{1}, {2}, {3}, {4}, {5}};
        List<List<Integer>> expected = Arrays.stream(numbers)
                .map(e -> Arrays.stream(e).boxed().collect(Collectors.toList())).collect(Collectors.toList());
        assertEquals(expected, solution102.levelOrder(TreeNodeUtils.arrayToTreeNode(new Integer[]{1, 2, null, 3, null, 4, null, 5})));
    }

    @Test
    void levelOrder4() {
        int[][] numbers = {{0}, {2, 4}, {1, 3, -1}, {5, 1, 6, 8}};
        List<List<Integer>> expected = Arrays.stream(numbers)
                .map(e -> Arrays.stream(e).boxed().collect(Collectors.toList())).collect(Collectors.toList());
        assertEquals(expected, solution102.levelOrder(TreeNodeUtils.arrayToTreeNode(new Integer[]{0, 2, 4, 1, null, 3, -1, 5, 1, null, 6, null, 8})));
    }
}