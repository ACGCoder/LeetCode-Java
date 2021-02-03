package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution419;

public class MySolution419 implements Solution419 {
    @Override
    public int countBattleships(char[][] board) {
        int count = 0;
        boolean isInShip = false;

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(isInShip && j == board[0].length - 1){ // 战舰中，当前为右边界，战舰数+1
                    count++;
                    isInShip = false;
                    board[i][j] = '.';
                    continue;
                }else if(isInShip && board[i][j] == 'X'){ // 右侧依然为当前战舰，继续遍历
                    board[i][j] = '.';
                    continue;
                }else if(isInShip && board[i][j] == '.'){ // 当前为战舰尾，战舰数+1
                    count++;
                    isInShip = false;
                    continue;
                }

                // 战舰头
                if(board[i][j] == 'X'){
                    if(j + 1 < board[0].length){ // 当前非右边界
                        if(board[i][j + 1] == 'X'){ // 右方依然为当前战舰
                            isInShip = true;
                            board[i][j] = '.';
                        }else if(i + 1 < board.length){ // 当前不是下边界
                            if(board[i + 1][j] == 'X'){ // 下方为当前战舰
                                isInShip = true;
                                board[i][j] = '.';
                                for(int k = i + 1; k < board.length; k++){
                                    if(k == board.length - 1){ // 当前为下边界，战舰数+1
                                        isInShip = false;
                                        board[k][j] = '.';
                                        count++;
                                        continue;
                                    }
                                    if(board[k][j] == 'X'){ // 当前为战舰
                                        board[k][j] = '.';
                                    }else { // 战舰尾，战舰数+1
                                        isInShip = false;
                                        board[k][j] = '.';
                                        count++;
                                        break;
                                    }
                                }
                            }else { // 战舰为单点，战舰数+1
                                count++;
                                isInShip = false;
                                board[i][j] = '.';
                            }
                        }else { // 战舰为单点，战舰数+1
                            count++;
                            isInShip = false;
                            board[i][j] = '.';
                        }
                    }else if(i + 1 < board.length){ // 当前为右边界，且不为下边界，查看下方
                        if(board[i + 1][j] == 'X'){ // 下方依然为战舰部分
                            isInShip = true;
                            board[i][j] = '.';
                            for(int k = i + 1; k < board.length; k++){
                                if(k == board.length - 1){ // 当前为下边界，战舰数+1
                                    isInShip = false;
                                    board[k][j] = '.';
                                    count++;
                                    continue;
                                }
                                if(board[k][j] == 'X'){ // 当前为战舰
                                    board[k][j] = '.';
                                }else { // 战舰尾，战舰数+1
                                    isInShip = false;
                                    board[k][j] = '.';
                                    count++;
                                    break;
                                }
                            }
                        }else { // 战舰为单点，战舰数+1
                            count++;
                            isInShip = false;
                            board[i][j] = '.';
                        }
                    }else { // 战舰为单点，战舰数+1
                        count++;
                        isInShip = false;
                        board[i][j] = '.';
                    }
                }
            }
        }
        return count;
    }
}
