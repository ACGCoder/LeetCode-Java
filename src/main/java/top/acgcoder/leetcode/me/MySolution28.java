package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution28;

public class MySolution28 implements Solution28 {
    @Override
    public int strStr(String haystack, String needle) {
        int i = 0, j = 0, index = 0;
        while (j < needle.length()) {
            if (i == haystack.length())
                return -1;
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (j == 0)
                    index = i;
                j++;
            } else {
                if (j != 0)
                    i = index;
                j = 0;
            }
            i++;
        }
        return index;
    }
}
