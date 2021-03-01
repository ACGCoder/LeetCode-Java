package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution144;
import top.acgcoder.leetcode.best.BestSolution144;
import top.acgcoder.leetcode.common.TreeNodeUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution144Test {

//    private Solution144 solution144 = new MySolution144();
    private Solution144 solution144 = new BestSolution144();

    @Test
    void preorderTraversal1() {
        List<Integer> expected = Stream.of(1, 2, 3).collect(Collectors.toList());
        assertEquals(expected, solution144.preorderTraversal(TreeNodeUtils.arrayToTreeNode(new String[]{"1", "null", "2", "3"})));
    }

    @Test
    void preorderTraversal2() {
        List<Integer> expected = Stream.of(1).collect(Collectors.toList());
        assertEquals(expected, solution144.preorderTraversal(TreeNodeUtils.arrayToTreeNode(new String[]{"1"})));
    }

    @Test
    void preorderTraversal3() {
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, solution144.preorderTraversal(TreeNodeUtils.arrayToTreeNode(new String[]{})));
    }

    @Test
    void preorderTraversal4() {
        List<Integer> expected = Stream.of(1, 2).collect(Collectors.toList());
        assertEquals(expected, solution144.preorderTraversal(TreeNodeUtils.arrayToTreeNode(new String[]{"1", "2"})));
    }

    @Test
    void preorderTraversal5() {
        List<Integer> expected = Stream.of(1, 2).collect(Collectors.toList());
        assertEquals(expected, solution144.preorderTraversal(TreeNodeUtils.arrayToTreeNode(new String[]{"1", "null", "2"})));
    }
}