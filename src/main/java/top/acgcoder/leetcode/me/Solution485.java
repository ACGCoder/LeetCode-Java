package top.acgcoder.leetcode.me;

public class Solution485 {
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
