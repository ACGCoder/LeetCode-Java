package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution238;

public class MySolution238 implements Solution238 {
    @Override
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int multiplyResult = 1, zeroCount = 0;
        for(int num : nums){
            if(num == 0){
                zeroCount++;
                if(zeroCount > 1){
                    break;
                }
                continue;
            }
            multiplyResult *= num;
        }

        for(int i = 0; i < nums.length; i++){
            if(zeroCount == 0){
                result[i] = multiplyResult / nums[i];
            }
            if(zeroCount == 1){
                result[i] = nums[i] == 0 ? multiplyResult : 0;
            }
            if(zeroCount > 1){
                result[i] = 0;
            }
        }
        return result;
    }
}
