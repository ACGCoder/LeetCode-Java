package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution498;

public class MySolution498 implements Solution498 {
    @Override
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return new int[0];

        int width = matrix[0].length;
        int height = matrix.length;
        int[] result = new int[width * height];
        int index = 0, x = 0, y = 0;
        boolean moveRight = true;

        while (index < width * height){
            if(moveRight){
                if(x + 1 < width && y - 1 >= 0){
                    result[index++] = matrix[y--][x++];
                }else {
                    moveRight = false;
                    if(x + 1 < width)
                        result[index++] = matrix[y][x++];
                    else
                        result[index++] = matrix[y++][x];
                }
            }else {
                if(y + 1 < height && x - 1 >= 0){
                    result[index++] = matrix[y++][x--];
                }else {
                    moveRight = true;
                    if(y + 1 < height)
                        result[index++] = matrix[y++][x];
                    else
                        result[index++] = matrix[y][x++];
                }
            }
        }
        return result;
    }
}
