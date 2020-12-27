package top.acgcoder.leetcode.best;

import top.acgcoder.leetcode.Solution485;

public class BestSolution485 implements Solution485 {
    @Override
    public int findMaxConsecutiveOnes(int[] nums) {
        int length = nums.length;
        int left = 0;
        int right = 0;
        int maxSize = 0;

        while(right < length){
            //当窗口中所有元素为 1 时，右指针向右移，扩大窗口。
            if (nums[right++] == 0){
                //当窗口中存在 0 时，计算连续序列长度，左指针指向右指针。
                maxSize = Math.max(maxSize, right - left - 1);
                left = right;
            }
        }
        // 因为最后一次连续序列在循环中无法比较，所以在循环外进行比较
        return Math.max(maxSize, right - left);
    }
}
