package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution661;

public class MySolution661 implements Solution661 {
    @Override
    public int[][] imageSmoother(int[][] M) {
        int width = M[0].length;
        int height = M.length;

        int[][] result = new int[height][width];

        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                int elementCount = 0;
                int elementSum = 0;
                for(int x = j - 1; x <= j + 1; x++){
                    for(int y = i - 1; y <= i + 1; y++){
                        boolean isInvalidElment = x < 0 || x >= width || y < 0 || y >= height;
                        if(!isInvalidElment) {
                            elementCount++;
                            elementSum += M[y][x];
                        }
                    }
                }
                result[i][j] = elementSum / elementCount;
            }
        }
        return result;
    }
}
