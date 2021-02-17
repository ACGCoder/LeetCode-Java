package top.acgcoder.leetcode.best;

import top.acgcoder.leetcode.Solution242;

import java.util.HashMap;

public class BestSolution242 implements Solution242 {
    @Override
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> magazineFrequency = new HashMap<>(t.length());
        for (char c : s.toCharArray())
            magazineFrequency.put(c, magazineFrequency.getOrDefault(c, 0) + 1);

        for (char c : t.toCharArray()){
            magazineFrequency.put(c, magazineFrequency.getOrDefault(c, 0) - 1);
            if (magazineFrequency.get(c) < 0)
                return false;
        }

        return true;
    }
}
