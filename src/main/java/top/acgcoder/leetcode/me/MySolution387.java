package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution387;

import java.util.LinkedHashMap;
import java.util.Map;

public class MySolution387 implements Solution387 {
    @Override
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == null){
                map.put(s.charAt(i), i);
            } else {
                map.put(s.charAt(i), -1);
            }
        }
        for (int index : map.values()) {
            if (index != -1)
                return index;
        }
        return -1;
    }
}
