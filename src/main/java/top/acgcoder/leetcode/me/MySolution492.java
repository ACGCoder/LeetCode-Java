package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution492;

public class MySolution492 implements Solution492 {
    @Override
    public int[] constructRectangle(int area) {
        int L = (int) Math.sqrt(area);
        int W = L;
        while (L * W != area) {
            if (L * W < area)
                L++;
            else
                W--;
        }
        return new int[]{L, W};
    }
}
