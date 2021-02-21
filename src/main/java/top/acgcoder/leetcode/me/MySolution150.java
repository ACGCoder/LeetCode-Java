package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution150;

import java.util.ArrayDeque;
import java.util.Deque;

public class MySolution150 implements Solution150 {
    @Override
    public int evalRPN(String[] tokens) {
        Deque<Integer> numbers = new ArrayDeque<>(1024);

        for (String token : tokens) {
            switch (token) {
                case "+":
                    numbers.push(numbers.pop() + numbers.pop());
                    break;
                case "-":
                    int top = numbers.pop();
                    numbers.push(numbers.pop() - top);
                    break;
                case "*":
                    numbers.push(numbers.pop() * numbers.pop());
                    break;
                case "/":
                    top = numbers.pop();
                    numbers.push(numbers.pop() / top);
                    break;
                default:
                    numbers.push(Integer.valueOf(token));
            }
        }

        return numbers.pop();
    }
}
