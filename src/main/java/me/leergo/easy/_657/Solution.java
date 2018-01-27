package me.leergo.easy._657;

class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        char[] move = moves.toCharArray();

        for (char aMove : move) {
            if ('R' == aMove) {
                x++;
            } else if ('L' == aMove) {
                x--;
            } else if ('U' == aMove) {
                y++;
            } else if ('D' == aMove) {
                y--;
            }
        }

        return x == 0 && y == 0;
    }
}