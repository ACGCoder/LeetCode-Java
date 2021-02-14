package top.acgcoder.leetcode.best;

import top.acgcoder.leetcode.Solution520;

public class BestSolution520 implements Solution520 {
    @Override
    public boolean detectCapitalUse(String word) {
        if(word == null || word.length() <= 1)
            return true;

        int count = 0;
        boolean result = false;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
                count++;
        }

        if((count == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') || count == word.length())
            result =  true;
        else if(count == 0)
            result = true;

        return result;
    }
}
