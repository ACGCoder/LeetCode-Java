package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution682;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class MySolution682 implements Solution682 {
    @Override
    public int calPoints(String[] ops) {
        Deque<Integer> stack = new ArrayDeque<>();
        int result = 0;
        for (String op : ops) {
            if ("+".equals(op)) {
                int top = stack.pop();
                int value = top + (stack.peek() == null ? 0 : stack.peek());
                stack.push(top);
                stack.push(value);
            } else if ("C".equals(op)) {
                stack.pop();
            } else if ("D".equals(op)) {
                stack.push((stack.peek() == null ? 0 : stack.peek()) * 2);
            } else {
                stack.push(Integer.valueOf(op));
            }
        }

        while (!stack.isEmpty())
            result += stack.pop();
        return result;
    }
}
