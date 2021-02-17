package top.acgcoder.leetcode.best;

import top.acgcoder.leetcode.Solution383;

public class BestSolution383 implements Solution383 {
    @Override
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] record = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            record[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--record[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
