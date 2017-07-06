package me.leergo._442;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>442. Find All Duplicates in an Array</h1>
 *
 * <b>create time : </b>2017-07-05 15:03:32<br>
 * <b>create by</b> : LeerGo!
 *
 * <p>
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * </p><p>
 * Find all the elements that appear twice in this array.
 * </p><p>
 * Could you do it without extra space and in O(n) runtime?
 * </p>
 */
public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for (int num : nums) {
            int index = Math.abs(num) - 1;
            if (nums[index] < 0) {
                res.add(Math.abs(index + 1));
            } else {
                nums[index] = -nums[index];
            }
        }

        return res;
    }
}