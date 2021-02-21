package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution5;

public class MySolution5 implements Solution5 {
    @Override
    public String longestPalindrome(String s) {
        int count = 1, left = 0, right = s.length() - 1;
        String result = s.substring(0, 1);
        while (right - left >= count) {
            int start = left, end = right;
            while (start < end) {
                if (s.charAt(start) == s.charAt(end)) {
                    start++;
                    end--;
                } else {
                    start = left;
                    right -= 1;
                    end = right;
                }
            }
            if (start != left && right + 1 - left > count) {
                result = s.substring(left, right + 1);
                count = result.length();
            }
            left++;
            right = s.length() - 1;
        }
        return result;
    }
}
