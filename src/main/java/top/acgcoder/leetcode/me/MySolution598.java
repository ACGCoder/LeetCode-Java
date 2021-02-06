package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution598;

public class MySolution598 implements Solution598 {
    @Override
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0)
            return m * n;

        int xMin = Integer.MAX_VALUE;
        int yMin = Integer.MAX_VALUE;
        for (int[] op : ops) {
            if (op[0] < xMin)
                xMin = op[0];
            if (op[1] < yMin)
                yMin = op[1];
        }
        return xMin * yMin;
    }
}
