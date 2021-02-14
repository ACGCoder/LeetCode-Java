package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution125;

public class MySolution125 implements Solution125 {
    @Override
    public boolean isPalindrome(String s) {
        if(s == null || s.length() <= 1)
            return true;

        for(int i = 0, j = s.length() - 1; i < j;){
            if(!Character.isLetterOrDigit(s.charAt(i)))
                i++;
            else if(!Character.isLetterOrDigit(s.charAt(j)))
                j--;
            else if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
