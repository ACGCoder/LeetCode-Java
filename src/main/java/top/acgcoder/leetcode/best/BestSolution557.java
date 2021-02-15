package top.acgcoder.leetcode.best;

import top.acgcoder.leetcode.Solution557;

public class BestSolution557 implements Solution557 {
    @Override
    public String reverseWords(String s) {
        StringBuilder ret = new StringBuilder();
        int length = s.length();
        int i = 0;
        while (i < length) {
            int start = i;
            while (i < length && s.charAt(i) != ' ') {
                i++;
            }
            for (int p = start; p < i; p++) {
                ret.append(s.charAt(start + i - 1 - p));
            }
            while (i < length && s.charAt(i) == ' ') {
                i++;
                ret.append(' ');
            }
        }
        return ret.toString();
    }
}
