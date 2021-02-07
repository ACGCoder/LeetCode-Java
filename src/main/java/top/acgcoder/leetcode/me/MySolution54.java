package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MySolution54 implements Solution54 {

    @Override
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix[0].length == 0)
            return Collections.emptyList();

        int width = matrix[0].length;
        int height = matrix.length;
        boolean[][] visited = new boolean[height][width];
        boolean notFinished = true;
        int[] currentPoint = {0, 0};
        List<Integer> result = new ArrayList<>(height * width);
        result.add(matrix[0][0]);
        visited[0][0] = true;

        int x = 0;
        int y = 0;

        while (notFinished){
            moveRight(matrix, visited, currentPoint, result);
            moveDown(matrix, visited, currentPoint, result);
            moveLeft(matrix, visited, currentPoint, result);
            moveUp(matrix, visited, currentPoint, result);

            if(x == currentPoint[0] && y == currentPoint[1])
                notFinished = false;
            else {
                x = currentPoint[0];
                y = currentPoint[1];
            }
        }

        return result;
    }

    private void moveRight(int[][] matrix, boolean[][] visited, int[] currentPoint, List<Integer> result){
        int x = currentPoint[0];
        int y = currentPoint[1];
        int i = x + 1;
        for(; i < matrix[0].length; i++){
            if(!visited[y][i]){
                result.add(matrix[y][i]);
                visited[y][i] = true;
            }else{
                break;
            }
        }
        currentPoint[0] = i - 1;
    }
    private void moveDown(int[][] matrix, boolean[][] visited, int[] currentPoint, List<Integer> result){
        int x = currentPoint[0];
        int y = currentPoint[1];
        int i = y + 1;
        for(; i < matrix.length; i++){
            if(!visited[i][x]){
                result.add(matrix[i][x]);
                visited[i][x] = true;
            }else {
                break;
            }
        }
        currentPoint[1] = i - 1;
    }
    private void moveLeft(int[][] matrix, boolean[][] visited, int[] currentPoint, List<Integer> result){
        int x = currentPoint[0];
        int y = currentPoint[1];
        int i = x - 1;
        for(; i >= 0; i--){
            if(!visited[y][i]){
                result.add(matrix[y][i]);
                visited[y][i] = true;
            }else {
                break;
            }
        }
        currentPoint[0] = i + 1;
    }
    private void moveUp(int[][] matrix, boolean[][] visited, int[] currentPoint, List<Integer> result){
        int x = currentPoint[0];
        int y = currentPoint[1];
        int i = y - 1;
        for(; i >= 0; i--){
            if(!visited[i][x]){
                result.add(matrix[i][x]);
                visited[i][x] = true;
            }else {
                break;
            }
        }
        currentPoint[1] = i + 1;
    }
}
