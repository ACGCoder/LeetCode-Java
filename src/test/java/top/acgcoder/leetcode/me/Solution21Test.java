package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution21;
import top.acgcoder.leetcode.common.ListNodeUtils;

import static org.junit.jupiter.api.Assertions.*;

class Solution21Test {

    private Solution21 solution21 = new MySolution21();

    @Test
    void mergeTwoLists1() {
        int[] nums1 = {1, 2, 4};
        int[] nums2 = {1, 3, 4};
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, ListNodeUtils.nodeToArray(solution21.mergeTwoLists(
                ListNodeUtils.arrayToNode(nums1), ListNodeUtils.arrayToNode(nums2))));
    }

    @Test
    void mergeTwoLists2() {
        int[] nums1 = {};
        int[] nums2 = {};
        assertArrayEquals(new int[]{}, ListNodeUtils.nodeToArray(solution21.mergeTwoLists(
                ListNodeUtils.arrayToNode(nums1), ListNodeUtils.arrayToNode(nums2))));
    }

    @Test
    void mergeTwoLists3() {
        int[] nums1 = {};
        int[] nums2 = {0};
        assertArrayEquals(new int[]{0}, ListNodeUtils.nodeToArray(solution21.mergeTwoLists(
                ListNodeUtils.arrayToNode(nums1), ListNodeUtils.arrayToNode(nums2))));
    }
}