package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution389;

import java.util.HashMap;
import java.util.Map;

public class MySolution389 implements Solution389 {
    @Override
    public char findTheDifference(String s, String t) {
        char result = 0;
        Map<Character, Integer> sFrequency = new HashMap<>(26);
        Map<Character, Integer> tFrequency = new HashMap<>(26);

        for (int i = 0; i < s.length(); i++){
            sFrequency.put(s.charAt(i), sFrequency.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++){
            tFrequency.put(t.charAt(i), tFrequency.getOrDefault(t.charAt(i), 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : tFrequency.entrySet()){
            if(!entry.getValue().equals(sFrequency.get(entry.getKey()))){
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
}
