package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution414;

public class MySolution414 implements Solution414 {
    @Override
    public int thirdMax(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(int num : nums){
            if(num > max)
                max = num;
            if(num < min)
                min = num;
        }
        int secondMax = min;
        for(int num : nums){
            if(num > secondMax && num < max)
                secondMax = num;
        }
        int thirdMax = min;
        for(int num : nums){
            if(num > thirdMax && num < secondMax)
                thirdMax = num;
        }
        if(thirdMax == secondMax)
            return max;
        else {
            return thirdMax;
        }
    }
}
