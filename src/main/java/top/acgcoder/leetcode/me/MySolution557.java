package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution557;

public class MySolution557 implements Solution557 {
    @Override
    public String reverseWords(String s) {
        int start = 0, pointer = 0;
        char[] reverseChars = s.toCharArray();
        while (start < reverseChars.length) {
            if(pointer == reverseChars.length || s.charAt(pointer) == ' '){
                int end = pointer - 1;
                while (start < end){
                    char tmp = reverseChars[end];
                    reverseChars[end--] = reverseChars[start];
                    reverseChars[start++] = tmp;
                }
                start = pointer + 1;
            }
            pointer++;
        }
        return new String(reverseChars);
    }
}
