package me.leergo.leetcode.question.easy._561;

import java.util.Arrays;

/**
 * <h1>561. Array Partition I</h1>
 *
 * <b>create time : </b>2017-07-05 15:58:43<br>
 * <b>create by</b> : LeerGo!
 *
 * <p>
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer,
 * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 * </p>
 *
 * <p>
 * 题目意思为：相邻值小段最大和
 * </p>
 */
public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}