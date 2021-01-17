package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution453;

import java.util.Arrays;

public class MySolution453 implements Solution453 {
    @Override
    public int minMoves(int[] nums) {
        int moves = 0;
        Arrays.sort(nums);
        for(int i = nums.length - 1; i > 0; i--){
            moves += nums[i] - nums[0];
        }
        return moves;
    }
}
