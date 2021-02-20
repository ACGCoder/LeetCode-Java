package top.acgcoder.leetcode.best;

import top.acgcoder.leetcode.Solution482;

public class BestSolution482 implements Solution482 {
    @Override
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder s = new StringBuilder();
        // 统计已打印字符个数
        int count = 0;
        // 倒序遍历字符串
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) != '-') {
                // 计算什么时候打印分隔符
                if (count != 0 && count % K == 0) {
                    s.append('-');
                }
                // 转为大写字母添加
                s.append(Character.toUpperCase(S.charAt(i)));
                count++;
            }
        }
        // 反转字符串
        return s.reverse().toString();
    }
}
