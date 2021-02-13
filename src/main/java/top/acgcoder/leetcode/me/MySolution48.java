package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution48;

public class MySolution48 implements Solution48 {
    @Override
    public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length <= 1)
            return;

        int w = matrix[0].length, h = matrix.length, count = 0;
        int top = 0, left = 0, right = w - 1, bottom = h - 1;
        int[] temp = new int[(w - 1) * 4];
        boolean isReadTurn = true;

        while (count < w * h){
            if(isReadTurn){
                int c = 0;
                for(int i = left; i <= right; i++)
                    temp[c++] = matrix[top][i];
                top++;
                for(int i = top; i <= bottom; i++)
                    temp[c++] = matrix[i][right];
                right--;
                for(int i = right; i >= left; i--)
                    temp[c++] = matrix[bottom][i];
                bottom--;
                for(int i = bottom; i >= top; i--)
                    temp[c++] = matrix[i][left];
                left++;

                top--;
                right++;
                bottom++;
                left--;
                isReadTurn = false;
            }else {
                int n = (right - left) * 3;
                int t = (right - left) * 4;
                if(n == 0)
                    return;

                for(int i = left; i <= right; i++){
                    matrix[top][i] = temp[n++ % t];
                    count++;
                }
                top++;
                for(int i = top; i <= bottom; i++){
                    matrix[i][right] = temp[n++ % t];
                    count++;
                }
                right--;
                for(int i = right; i >= left; i--){
                    matrix[bottom][i]= temp[n++ % t];
                    count++;
                }
                bottom--;
                for(int i = bottom; i >= top; i--){
                    matrix[i][left] = temp[n++ % t];
                    count++;
                }
                left++;

                isReadTurn = true;
            }
        }
    }
}
