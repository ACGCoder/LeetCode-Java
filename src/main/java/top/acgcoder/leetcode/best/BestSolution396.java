package top.acgcoder.leetcode.best;

import top.acgcoder.leetcode.Solution396;

public class BestSolution396 implements Solution396 {
    @Override
    public int maxRotateFunction(int[] A) {
        int n = A.length;
        int max = 0;
        int count = 0;
        // 统计数组所有数的和
        int sum = 0;
        // 计算 F(1) 的值
        for (int i : A) {
            max += count++ * i;
            sum += i;
        }
        // 记录上一个计算结果
        int tmp = max;
        for (int i = 1; i < n; i++) {
            // 利用等差数列求解
            tmp = tmp + sum - n * A[n - i];
            if (max < tmp) {
                max = tmp;
            }
        }
        return max;
    }
}
