package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution145;
import top.acgcoder.leetcode.common.TreeNodeUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution145Test {

    private final Solution145 solution145 = new MySolution145();

    @Test
    void postOrderTraversal1() {
        List<Integer> expected = Stream.of(3, 2, 1).collect(Collectors.toList());
        assertEquals(expected, solution145.postorderTraversal(TreeNodeUtils.arrayToTreeNode(new Integer[]{1, null, 2, 3})));
    }

    @Test
    void postOrderTraversal2() {
        List<Integer> expected = Stream.of(4, 5, 2, 6, 7, 3, 1).collect(Collectors.toList());
        assertEquals(expected, solution145.postorderTraversal(TreeNodeUtils.arrayToTreeNode(new Integer[]{1, 2, 3, 4, 5, 6, 7})));
    }
}