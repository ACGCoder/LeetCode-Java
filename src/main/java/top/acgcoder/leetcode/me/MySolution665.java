package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution665;

public class MySolution665 implements Solution665 {
    @Override
    public boolean checkPossibility(int[] nums) {
        boolean possible = true;
        int index = 0;
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                count++;
                index = i;
            }
            if(count > 1){
                return false;
            }
        }

        for(int i = 0; i < nums.length - 1; i++){
            if(i == index)
                continue;
            if(i + 1 == index && i + 2 < nums.length){
                if(nums[i] > nums[i + 2]){
                    possible = false;
                    break;
                }
                continue;
            }
            if(nums[i] > nums[i + 1]){
                possible = false;
                break;
            }
        }

        if(possible)
            return true;

        index = index + 1;
        possible = true;

        for(int i = 0; i < nums.length - 1; i++){
            if(i == index)
                continue;
            if(i + 1 == index ){
                if(i + 2 < nums.length){
                    if(nums[i] > nums[i + 2]){
                        possible = false;
                        break;
                    }
                    continue;
                }
                else
                    break;
            }
            if(nums[i] > nums[i + 1]){
                possible = false;
                break;
            }
        }

        return possible;
    }
}
