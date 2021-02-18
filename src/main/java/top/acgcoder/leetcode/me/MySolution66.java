package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution66;

public class MySolution66 implements Solution66 {
    @Override
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0;) {
            if (digits[i] == 9) {
                digits[i--] = 0;
                if (i == -1) {
                    digits = new int[digits.length + 1];
                    digits[0] = 1;
                }
            } else {
                digits[i] += 1;
                break;
            }
        }
        return digits;
    }
}
