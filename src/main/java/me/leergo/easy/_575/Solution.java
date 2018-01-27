package me.leergo.easy._575;

import java.util.HashSet;
import java.util.Set;

/**
 * <h1>575. Distribute Candies</h1>
 *
 * <b>create time : </b>2017-07-06 22:06:09<br>
 * <b>create by</b> : LeerGo!
 *
 * <p>
 * Given an integer array with even length, where different numbers in this array represent different kinds of candies.
 * Each number means one candy of the corresponding kind. You need to distribute these candies equally in number to brother and sister.
 * Return the maximum number of kinds of candies the sister could gain.
 * </p>
 * <p>
 * <b>思路：</b><br>
 * 妹妹拿到的糖果种类，最多为糖果数量的一半。<br>
 * 如果，糖果种类大于糖果数量的一半，那么妹妹就能拿到数量一半那么多种类的糖果；<br>
 * 否则，糖果种类有多少就能拿多少
 * </p>
 */
public class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> kinds = new HashSet<>();
        for (int candy : candies) {
            kinds.add(candy);
        }
        return Math.min(candies.length / 2, kinds.size());
    }

//    public int distributeCandies(int[] candies) {
//        return Math.min(candies.length / 2, IntStream.of(candies).boxed().collect(Collectors.toSet()).size());
//    }
}