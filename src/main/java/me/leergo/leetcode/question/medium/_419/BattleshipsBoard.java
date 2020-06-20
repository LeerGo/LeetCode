package me.leergo.leetcode.question.medium._419;

/**
 * Created by Xoder on 2017/7/6.
 */
public class BattleshipsBoard {
    public static void main(String[] args) {
        char[][] board = {
                {'.', '.', '.', 'X'},
                {'X', 'X', 'X', 'X'},
                {'.', '.', '.', 'X'},
        };
        System.out.println(new Solution().countBattleships(board));
    }
}
