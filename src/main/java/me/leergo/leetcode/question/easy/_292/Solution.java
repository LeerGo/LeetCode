package me.leergo.leetcode.question.easy._292;

/**
 * <h1>292. Nim Game</h1>
 *
 * <b>create time : </b>2017-07-06 22:24:58<br>
 * <b>create by</b> : LeerGo!
 *
 * <p>
 * You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
 * </p><p>
 * Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.
 * </p><p>
 * For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
 * </p>
 *
 * <p>
 * <b>思路</b><br>
 * 由题意，n = 4 是赢不了的，由此可推，所有 4N 的结果都是不可赢<br>
 * 4 < x < 2*4，x = [5, 6, 7]，计算可知，该三种情况都是可赢的<br>
 * 2*4 < x < 3*4，x = [9, 10, 11]，减去四后，又转化为 x = [5, 6, 7]的情况<br>
 * 故此，我们可以推导，n%4 == 0 时必输，此外都有赢的可能性<br>
 * </p>
 */
public class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}