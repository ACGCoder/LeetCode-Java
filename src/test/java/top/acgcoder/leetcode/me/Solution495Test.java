package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class Solution495Test {

    @Test
    void findPoisonedDuration1() {
        int[] timeSeries = {1,4};
        int duration = 2;

        Solution495 solution495 = new Solution495();
        assertEquals(4, solution495.findPoisonedDuration(timeSeries, duration));
    }

    @Test
    void findPoisonedDuration2() {
        int[] timeSeries = {1,2};
        int duration = 2;

        Solution495 solution495 = new Solution495();
        assertEquals(3, solution495.findPoisonedDuration(timeSeries, duration));
    }

    @Test
    void findPoisonedDuration3() {
        int[] timeSeries = {1,2,3};
        int duration = 5;

        Solution495 solution495 = new Solution495();
        assertEquals(7, solution495.findPoisonedDuration(timeSeries, duration));
    }

    @Test
    void findPoisonedDuration4() {
        int[] timeSeries = {1,4};
        int duration = 3;

        Solution495 solution495 = new Solution495();
        assertEquals(6, solution495.findPoisonedDuration(timeSeries, duration));
    }

    @Test
    void findPoisonedDuration5() {
        int[] timeSeries = {0,7};
        int duration = 3;

        Solution495 solution495 = new Solution495();
        assertEquals(6, solution495.findPoisonedDuration(timeSeries, duration));
    }

    @Test
    void findPoisonedDuration6() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("/Users/ACGCoder/LeetCode/src/main/resources/array.txt"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
        String s = reader.readLine();
        String[] timeSeriesStr = s.split(",");

        int[] timeSeries = new int[timeSeriesStr.length];
        for(int i = 0; i < timeSeries.length; i++){
            timeSeries[i] = Integer.parseInt(timeSeriesStr[i]);
        }

        int duration = 5;

        Solution495 solution495 = new Solution495();
        assertEquals(49771, solution495.findPoisonedDuration(timeSeries, duration));
    }
}