package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution520;

public class MySolution520 implements Solution520 {
    @Override
    public boolean detectCapitalUse(String word) {
        if(word == null || word.length() <= 1)
            return true;

        boolean firstUpperCase = Character.isUpperCase(word.charAt(0));
        boolean secondUpperCase = Character.isUpperCase(word.charAt(1));
        for (int i = 1; i < word.length(); i++){
            if(!firstUpperCase && Character.isUpperCase(word.charAt(i)))
                return false;
            if(firstUpperCase && secondUpperCase && Character.isLowerCase(word.charAt(i)))
                return false;
            if(firstUpperCase && !secondUpperCase && Character.isUpperCase(word.charAt(i)))
                return false;
        }
        return true;
    }
}
