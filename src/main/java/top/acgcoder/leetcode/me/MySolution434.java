package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution434;

public class MySolution434 implements Solution434 {
    @Override
    public int countSegments(String s) {
        if(s == null || s.length() == 0)
            return 0;

        int count = s.charAt(0) == ' ' ? 0 : 1 ;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != ' ' && s.charAt(i - 1) == ' ')
                count++;
        }
        return count;
    }
}
