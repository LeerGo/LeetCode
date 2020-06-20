package me.leergo.leetcode.question.easy._476;

public class Solution {
    public int findComplement(int num) {
        int    al = Integer.toBinaryString(num).length();
        String as = Integer.toBinaryString(~num).substring(32 - al, 32);
        return Integer.parseInt(as, 2);
    }

    /*
    最优解
    public int findComplement(int num) {
       int mask = (Integer.highestOneBit(num) << 1) - 1;
       num = ~num;
       return num & mask;
    }
    */

}