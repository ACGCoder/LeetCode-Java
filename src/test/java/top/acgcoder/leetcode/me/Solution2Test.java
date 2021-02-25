package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution2;
import top.acgcoder.leetcode.best.BestSolution2;
import top.acgcoder.leetcode.common.ListNodeUtils;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private Solution2 solution2 = new MySolution2();
//    private Solution2 solution2 = new BestSolution2();

    @Test
    void addTwoNumbers1() {
        int[] nums1 = {2, 4, 3};
        int[] nums2 = {5, 6, 4};
        assertArrayEquals(new int[]{7, 0, 8}, ListNodeUtils.nodeToArray(
                solution2.addTwoNumbers(ListNodeUtils.arrayToNode(nums1), ListNodeUtils.arrayToNode(nums2))));
    }

    @Test
    void addTwoNumbers2() {
        int[] nums1 = {0};
        int[] nums2 = {0};
        assertArrayEquals(new int[]{0}, ListNodeUtils.nodeToArray(
                solution2.addTwoNumbers(ListNodeUtils.arrayToNode(nums1), ListNodeUtils.arrayToNode(nums2))));
    }

    @Test
    void addTwoNumbers3() {
        int[] nums1 = {9, 9, 9, 9, 9, 9, 9};
        int[] nums2 = {9, 9, 9, 9};
        assertArrayEquals(new int[]{8, 9, 9, 9, 0, 0, 0, 1}, ListNodeUtils.nodeToArray(
                solution2.addTwoNumbers(ListNodeUtils.arrayToNode(nums1), ListNodeUtils.arrayToNode(nums2))));
    }

    @Test
    void addTwoNumbers4() {
        int[] nums1 = {9};
        int[] nums2 = {1, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, ListNodeUtils.nodeToArray(
                solution2.addTwoNumbers(ListNodeUtils.arrayToNode(nums1), ListNodeUtils.arrayToNode(nums2))));
    }
}