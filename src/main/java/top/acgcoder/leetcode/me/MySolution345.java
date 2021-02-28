package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution345;

import java.util.Arrays;

public class MySolution345 implements Solution345 {
    @Override
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] result = s.toCharArray();
        while (i < j) {
            if (isNotVowel(result[i]))
                i++;
            else if (isNotVowel(result[j]))
                j--;
            else {
                char c = result[j];
                result[j--] = result[i];
                result[i++] = c;
            }
        }
        return new String(result);
    }

    private boolean isNotVowel(char c) {
        c = Character.toLowerCase(c);
        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u';
    }
}
