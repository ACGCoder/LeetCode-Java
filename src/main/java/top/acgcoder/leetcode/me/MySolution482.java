package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution482;

public class MySolution482 implements Solution482 {
    @Override
    public String licenseKeyFormatting(String S, int K) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = S.length() - 1; i >= 0; i--) {
            char c = S.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c -= 32;
                stringBuilder.append(c);
            } else if (c == '-') {
                continue;
            } else {
                stringBuilder.append(c);
            }
            count++;
            if (count % K == 0) {
                stringBuilder.append('-');
            }
        }
        if(stringBuilder.length() > 1 && stringBuilder.charAt(stringBuilder.length() - 1) == '-')
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.reverse().toString();
    }
}
