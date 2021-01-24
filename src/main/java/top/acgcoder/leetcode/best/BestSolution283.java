package top.acgcoder.leetcode.best;

import top.acgcoder.leetcode.Solution283;

public class BestSolution283 implements Solution283 {
    @Override
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i  = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }

        while (j < nums.length)
            nums[j++] = 0;
    }
}
