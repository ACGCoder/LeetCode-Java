package top.acgcoder.leetcode.best;

import top.acgcoder.leetcode.Solution389;

public class BestSolution389 implements Solution389 {
    @Override
    public char findTheDifference(String s, String t) {
        int ret = 0;
        for (int i = 0; i < s.length(); ++i) {
            ret ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            ret ^= t.charAt(i);
        }
        return (char) ret;
    }
}
