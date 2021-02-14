package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution304;

public class MySolution304 implements Solution304 {

    private int[][] sumMatrix;

    public MySolution304(int[][] matrix){
        if(matrix == null || matrix.length == 0)
            return;

        sumMatrix = new int[matrix.length + 1][matrix[0].length + 1];

        for (int y = 1; y < matrix.length + 1; y++){
            for(int x = 1; x < matrix[0].length + 1; x++){
                sumMatrix[y][x] = matrix[y - 1][x - 1] + sumMatrix[y - 1][x]
                        + sumMatrix[y][x - 1]- sumMatrix[y - 1][x - 1];
            }
        }
    }

    @Override
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sumMatrix[row2 + 1][col2 + 1] - sumMatrix[row1][col2 + 1]
                - sumMatrix[row2 + 1][col1] + sumMatrix[row1][col1];
    }
}
