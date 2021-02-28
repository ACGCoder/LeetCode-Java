package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution100;
import top.acgcoder.leetcode.best.BestSolution100;
import top.acgcoder.leetcode.common.TreeNodeUtils;

import static org.junit.jupiter.api.Assertions.*;

class Solution100Test {

//    private Solution100 solution100 = new MySolution100();
    private Solution100 solution100 = new BestSolution100();

    @Test
    void isSameTree() {
        assertFalse(solution100.isSameTree(TreeNodeUtils.arrayToTreeNode(new String[]{"1", "2"}), TreeNodeUtils.arrayToTreeNode(new String[]{"1", "null", "2"})));
        assertFalse(solution100.isSameTree(TreeNodeUtils.arrayToTreeNode(new String[]{"1", "2", "1"}), TreeNodeUtils.arrayToTreeNode(new String[]{"1", "1", "2"})));
        assertTrue(solution100.isSameTree(TreeNodeUtils.arrayToTreeNode(new String[]{"1", "2", "3"}), TreeNodeUtils.arrayToTreeNode(new String[]{"1", "2", "3"})));
    }
}