package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution58;

public class MySolution58 implements Solution58 {
    @Override
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' ')
                if(end == i)
                    end--;
                else
                    return end - i;
        }
        return end + 1;
    }

    // use trim
    /*public int lengthOfLastWord(String s) {
        s = s.trim();
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' ')
                return s.length() - 1 - i;
        }
        return s.length();
    }*/

}
