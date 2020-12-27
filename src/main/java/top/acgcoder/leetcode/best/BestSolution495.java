package top.acgcoder.leetcode.best;

import top.acgcoder.leetcode.Solution495;

public class BestSolution495 implements Solution495 {
    @Override
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        if (n == 0) return 0;

        int total = 0;
        for(int i = 0; i < n - 1; ++i){
            total += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
        }
        return total + duration;
    }
}
