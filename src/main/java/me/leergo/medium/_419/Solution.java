package me.leergo.medium._419;

/**
 * <h1>419. Battleships in a Board</h1>
 *
 * <b>create time : </b>2017-07-06 10:01:07<br>
 * <b>create by</b> : LeerGo!
 *
 * <p>
 * Given an 2D board, count how many battleships are in it.
 * The battleships are represented with 'X's, empty slots are represented with '.'s. You may assume the following rules:
 * <ul>
 * <li>You receive a valid board, made of only battleships or empty slots.</li>
 * <li>Battleships can only be placed horizontally or vertically.
 * In other words, they can only be made of the shape 1xN (1 row, N columns) or Nx1 (N rows, 1 column),
 * where N can be of any size.</li>
 * <li>At least one horizontal or vertical cell separates between two battleships - there are no adjacent battleships.</li>
 * </ul>
 * </p>
 */
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