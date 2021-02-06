package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution396;

public class MySolution396 implements Solution396 {
    @Override
    public int maxRotateFunction(int[] A) {
        if(A.length == 0)
            return 0;

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++){
            int result = calucateRotateResult(A);
            if(result > max) {
                max = result;
            }
            rotate(A, 1);
        }
        return max;
    }

    private int calucateRotateResult(int[] A){
        int result = 0;
        for(int i = 0; i < A.length; i++){
            result += i * A[i];
        }
        return result;
    }

    private void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}
