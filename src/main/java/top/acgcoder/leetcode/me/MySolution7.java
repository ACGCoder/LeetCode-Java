package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution7;

public class MySolution7 implements Solution7 {
    @Override
    public int reverse(int x) {
        long y = 0;
        while (x != 0) {
            y *= 10;
            y += x % 10;
            x /= 10;
        }
        if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE)
            return 0;
        return (int) y;
    }
}
