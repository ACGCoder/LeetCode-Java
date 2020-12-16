package top.acgcoder.leetcode.best;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.me.Solution495;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class BestSolution495Test {

    @Test
    void findPoisonedDuration() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("/Users/ACGCoder/LeetCode/src/main/resources/array.txt"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
        String s = reader.readLine();
        String[] timeSeriesStr = s.split(",");

        int[] timeSeries = new int[timeSeriesStr.length];
        for(int i = 0; i < timeSeries.length; i++){
            timeSeries[i] = Integer.parseInt(timeSeriesStr[i]);
        }

        int duration = 5;

        BestSolution495 solution495 = new BestSolution495();
        assertEquals(49771, solution495.findPoisonedDuration(timeSeries, duration));
    }
}