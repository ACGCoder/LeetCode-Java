package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution303;

public class MySolution303 implements Solution303 {

    private final int[] nums;
    private int sum = 0;

    public MySolution303(int[] nums){
        this.nums = nums;
        for (int num : nums)
            sum += num;
    }

    @Override
    public int sumRange(int i, int j) {
        int result = 0;
        if(j - i > nums.length / 2){
            result = sum;
            for(int x = 0; x < i; x++)
                result -= nums[x];
            for(int x = nums.length - 1; x > j; x--)
                result -= nums[x];
        }else {
            for(int x = i; x <= j; x++)
                result += nums[x];
        }
        return result;
    }
}
