package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution14;

public class MySolution14 implements Solution14 {
    @Override
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";

        int i = 0;
        boolean finish = false;
        for(; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(i == strs[j].length() || strs[j].charAt(i) != c) {
                    finish = true;
                    break;
                }
            }
            if(finish)
                break;
        }
        return strs[0].substring(0, i);
    }
}
