package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution20;

import java.util.ArrayDeque;
import java.util.Deque;

public class MySolution20 implements Solution20 {
    @Override
    public boolean isValid(String s) {
        if (s.length() % 2 == 1)
            return false;

        Deque<Character> stack = new ArrayDeque<>(1024);

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{')
                        return false;
                    break;
                default:
                    stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }
}
