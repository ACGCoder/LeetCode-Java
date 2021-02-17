package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution383;

import java.util.HashMap;

public class MySolution383 implements Solution383 {
    @Override
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineFrequency = new HashMap<>(26);
        for (char c : magazine.toCharArray())
            magazineFrequency.put(c, magazineFrequency.getOrDefault(c, 0) + 1);

        for (char c : ransomNote.toCharArray()){
            if(magazineFrequency.getOrDefault(c, 0) == 0)
                return false;
            else
                magazineFrequency.put(c, magazineFrequency.get(c) - 1);
        }
        return true;
    }
}
