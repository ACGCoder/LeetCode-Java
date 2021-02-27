package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution50;

public class MySolution50 implements Solution50 {

    // 超时, 此题未解决
    @Override
    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1.0 / x;
            n = -n;
        }

        double result = 1.0;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        return result;
    }
}
