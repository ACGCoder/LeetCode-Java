package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution59;

public class MySolution59 implements Solution59 {
    @Override
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int element = 1;
        int top = 0, left = 0, bottom = n - 1, right = n - 1;
        while (top < bottom && left < right){
            for(int x = left; x < right; x++){
                result[top][x] = element++;
            }
            for(int y = top; y < bottom; y++){
                result[y][right] = element++;
            }
            for(int x = right; x > left; x--){
                result[bottom][x] = element++;
            }
            for(int y = bottom; y > top; y--){
                result[y][left] = element++;
            }

            top++;
            left++;
            right--;
            bottom--;
        }
        if(top == bottom && left == right)
            result[top][left] = element;
        return result;
    }
}
