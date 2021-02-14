package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution289;

public class MySolution289 implements Solution289 {
    @Override
    public void gameOfLife(int[][] board) {
        if(board == null || board.length == 0)
            return;

        int w = board[0].length, h = board.length;
        int[][] result = new int[h][w];

        for(int y = 0; y < h; y++){
            for(int x = 0; x < w; x++){
                int count = 0;
                for(int j = y - 1; j <= y + 1; j++){
                    for(int i = x - 1; i <= x + 1; i++){
                        if(j < 0 || j >= h || i < 0 || i >= w || (j == y && i == x)){
                            continue;
                        }
                        count += board[j][i];
                    }
                }
                if(board[y][x] == 1){
                    if(count < 2 || count > 3)
                        result[y][x] = 0;
                    else
                        result[y][x] = 1;
                }else {
                    if(count == 3){
                        result[y][x] = 1;
                    }else {
                        result[y][x] = 0;
                    }
                }
            }
        }

        for(int y = 0; y < h; y++) {
            System.arraycopy(result[y], 0, board[y], 0, w);
        }
    }
}
