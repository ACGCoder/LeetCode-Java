package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution189;

public class MySolution189 implements Solution189 {
    @Override
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        for(int i = k; i > 0; i--){
            for(int j = nums.length - i; j > k - i; j--){
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
        }
    }
}
