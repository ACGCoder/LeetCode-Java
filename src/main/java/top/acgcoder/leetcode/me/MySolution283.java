package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution283;

public class MySolution283 implements Solution283 {
    @Override
    public void moveZeroes(int[] nums) {
        if(nums.length == 1)
            return;

        int notZeroElementIndex = 1;
        for(int i = 0; i < nums.length; i++){
            while((notZeroElementIndex < nums.length - 1) && nums[notZeroElementIndex] == 0 || notZeroElementIndex == i)
                notZeroElementIndex++;
            if(notZeroElementIndex > nums.length - 1)
                notZeroElementIndex = nums.length - 1;
            if(nums[i] == 0){
                nums[i] += nums[notZeroElementIndex];
                nums[notZeroElementIndex] = 0;
            }
        }
    }
}
