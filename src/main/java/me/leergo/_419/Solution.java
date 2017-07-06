package me.leergo._419;

public class Solution {
    public int countBattleships(char[][] board) {
        int res    = 0;
        int width  = board[0].length;
        int height = board.length;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (board[i][j] == '.'
                    || (i > 0 && board[i - 1][j] == 'X')
                    || (j > 0 && board[i][j - 1] == 'X')) {
                    continue;
                } else {
                    res++;
                }
            }
        }
        return res;
    }
}