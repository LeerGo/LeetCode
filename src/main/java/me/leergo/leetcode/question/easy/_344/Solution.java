package me.leergo.leetcode.question.easy._344;

/**
 * <h1>344. Reverse String</h1>
 *
 * <b>create time : </b>2017-07-05 15:03:32<br>
 * <b>create by</b> : LeerGo!
 *
 * <p>
 * Write a function that takes a string as input and returns the string reversed.
 * </p>
 */
public class Solution {
//    public String reverseString(String s) {
//        return String.valueOf(new StringBuilder(s).reverse());
//    }

    public String reverseString(String s) {
        char[] res  = s.toCharArray();
        int    to   = 0;
        int    from = res.length - 1;
        while (to < from) {
            char tem = res[to];
            res[to] = res[from];
            res[from] = tem;

            to++;
            from--;
        }

        return new String(res);
    }
}