package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution73;

import java.util.HashSet;
import java.util.Set;

public class MySolution73 implements Solution73 {
    @Override
    public void setZeroes(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return;

        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();

        for(int y = 0; y < matrix.length; y++){
            for(int x = 0; x < matrix[0].length; x++){
                if(matrix[y][x] == 0){
                    row.add(y);
                    col.add(x);
                }
            }
        }

        for(int y = 0; y < matrix.length; y++){
            for(int x = 0; x < matrix[0].length; x++){
                if(row.contains(y) || col.contains(x))
                    matrix[y][x] = 0;
            }
        }
    }
}
