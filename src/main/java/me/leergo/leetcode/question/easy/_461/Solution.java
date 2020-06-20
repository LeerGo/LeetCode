package me.leergo.leetcode.question.easy._461;

/**
 * <h1>535. Encode and Decode TinyURL</h1>
 *
 * <b>create time : </b>2017-07-05 15:03:32<br>
 * <b>create by</b> : LeerGo!
 *
 * <p>
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 * </p>
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        char[] ac = Integer.toBinaryString(x).toCharArray();
        char[] bc = Integer.toBinaryString(y).toCharArray();

        int acl = ac.length;
        int bcl = bc.length;

        int record = 0;

        if (acl > bcl) {
            int difSize = acl - bcl;
            for (int i = 0; i < difSize; i++) {
                if (ac[i] == '1') {
                    record++;
                }
            }

            for (int i = 0; i < bcl; i++) {
                if (bc[i] != ac[i + difSize]) {
                    record++;
                }
            }
        } else if (acl < bcl) {
            int difSize = bcl - acl;
            for (int i = 0; i < difSize; i++) {
                if (bc[i] == '1') {
                    record++;
                }
            }

            for (int i = 0; i < acl; i++) {
                if (ac[i] != bc[i + difSize]) {
                    record++;
                }
            }
        } else {
            for (int i = 0; i < ac.length; i++) {
                if (ac[i] != bc[i]) {
                    record++;
                }
            }
        }
        return record;
    }

    /*
    位运算 最优解
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
    */

}
