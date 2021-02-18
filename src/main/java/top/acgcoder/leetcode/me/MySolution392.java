package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution392;

public class MySolution392 implements Solution392 {
    @Override
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length())
            if (t.charAt(j++) == s.charAt(i))
                i++;

        return i == s.length();
    }
}
