package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution495;
import top.acgcoder.leetcode.best.BestSolution495;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class Solution495Test {
    private Solution495 solution495 = new BestSolution495();
//    private Solution495 solution495 = new MySolution495();

    @Test
    void findPoisonedDuration1() {
        int[] timeSeries = {1,4};
        int duration = 2;

        assertEquals(4, solution495.findPoisonedDuration(timeSeries, duration));
    }

    @Test
    void findPoisonedDuration2() {
        int[] timeSeries = {1,2};
        int duration = 2;

        assertEquals(3, solution495.findPoisonedDuration(timeSeries, duration));
    }

    @Test
    void findPoisonedDuration3() {
        int[] timeSeries = {1,2,3};
        int duration = 5;

        assertEquals(7, solution495.findPoisonedDuration(timeSeries, duration));
    }

    @Test
    void findPoisonedDuration4() {
        int[] timeSeries = {1,4};
        int duration = 3;

        assertEquals(6, solution495.findPoisonedDuration(timeSeries, duration));
    }

    @Test
    void findPoisonedDuration5() {
        int[] timeSeries = {0,7};
        int duration = 3;

        assertEquals(6, solution495.findPoisonedDuration(timeSeries, duration));
    }

    @Test
    void findPoisonedDuration6() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/ACGCoder/LeetCode/src/main/resources/495.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
        String s = reader.readLine();
        String[] timeSeriesStr = s.split(",");

        int[] timeSeries = new int[timeSeriesStr.length];
        for(int i = 0; i < timeSeries.length; i++){
            timeSeries[i] = Integer.parseInt(timeSeriesStr[i]);
        }

        int duration = 5;

        assertEquals(49771, solution495.findPoisonedDuration(timeSeries, duration));
    }
}