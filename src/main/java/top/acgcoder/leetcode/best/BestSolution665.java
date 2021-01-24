package top.acgcoder.leetcode.best;

import top.acgcoder.leetcode.Solution665;

public class BestSolution665 implements Solution665 {
    @Override
    public boolean checkPossibility(int[] nums) {
        int cnt = 0;
        for(int i = 1; i < nums.length && cnt<=1 ; i++){
            if(nums[i-1] > nums[i]){
                cnt++;
                if(i-2>=0 && nums[i-2] > nums[i])
                    nums[i] = nums[i-1];
            }
        }
        return cnt<=1;
    }
}
