package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution566;

public class MySolution566 implements Solution566 {
    @Override
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums == null || nums.length == 0)
            return nums;

        int width = nums[0].length;
        int height = nums.length;

        if(r * c != width * height)
            return nums;

        int[][] result = new int[r][c];
        int w = 0, h = 0;

        for (int[] num : nums) {
            for (int x = 0; x < width; x++) {
                if (w == c) {
                    w = 0;
                    h++;
                }
                result[h][w++] = num[x];
            }
        }
        return result;
    }
}
