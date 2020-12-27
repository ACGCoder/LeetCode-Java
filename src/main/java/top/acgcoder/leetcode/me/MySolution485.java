package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution485;

public class MySolution485 implements Solution485 {
    @Override
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int lastConsecutiveOnes = 0;
        for (int num: nums) {
            if (num == 1) {
                lastConsecutiveOnes++;
            } else {
                if (lastConsecutiveOnes > maxConsecutiveOnes)
                    maxConsecutiveOnes = lastConsecutiveOnes;
                lastConsecutiveOnes = 0;
            }
        }
        return Math.max(lastConsecutiveOnes, maxConsecutiveOnes);
    }
}
