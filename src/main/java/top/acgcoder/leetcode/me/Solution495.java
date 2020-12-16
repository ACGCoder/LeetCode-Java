package top.acgcoder.leetcode.me;

public class Solution495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 0)
            return 0;
        int poisonedDuration = 0;
        int finishTime = timeSeries[0];
        for (int time : timeSeries) {
            if (finishTime > time) {
                int currentPoisonedDuration = duration - (finishTime - time);
                finishTime += currentPoisonedDuration;
                poisonedDuration += currentPoisonedDuration;
            } else {
                finishTime = time + duration;
                poisonedDuration += duration;
            }
        }
        return poisonedDuration;
    }
}
