package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution119;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Solution119Test {

    private Solution119 solution119 = new MySolution119();

    @Test
    void getRow1() {
        List<Integer> list = Stream.of(1,3,3,1).collect(Collectors.toList());
        assertEquals(list, solution119.getRow(3));
    }
    @Test
    void getRow2() {
        List<Integer> list = Stream.of(1,4,6,4,1).collect(Collectors.toList());
        assertEquals(list, solution119.getRow(4));
    }
}