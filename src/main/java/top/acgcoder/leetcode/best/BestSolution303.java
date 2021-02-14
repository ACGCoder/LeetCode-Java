package top.acgcoder.leetcode.best;

import top.acgcoder.leetcode.Solution303;

public class BestSolution303 implements Solution303 {

    private final int[] sum;

    public BestSolution303(int[] nums){
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
    }

    @Override
    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }
}
