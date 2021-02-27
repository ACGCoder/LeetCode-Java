package top.acgcoder.leetcode.best;

import top.acgcoder.leetcode.Solution492;

public class BestSolution492 implements Solution492 {
    @Override
    public int[] constructRectangle(int area) {
        int L = (int) Math.sqrt(area);
        int W = L;
        while (L * W != area) {
            if (area % W == 0)
                L = area / W;
            else
                W--;
        }
        return new int[]{L, W};
    }
}
