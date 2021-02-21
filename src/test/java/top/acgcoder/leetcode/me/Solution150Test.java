package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution150;

import static org.junit.jupiter.api.Assertions.*;

class Solution150Test {

    private final Solution150 solution150 = new MySolution150();

    @Test
    void evalRPN1() {
        assertEquals(9, solution150.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

    @Test
    void evalRPN2() {
        assertEquals(6, solution150.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }

    @Test
    void evalRPN3() {
        assertEquals(22, solution150.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }


}