package me.leergo.easy._412;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>412. Fizz Buzz</h1>
 *
 * <b>create time : </b>2017-07-06 10:57:48<br>
 * <b>create by</b> : LeerGo!
 *
 * <p>
 * Write a program that outputs the string representation of numbers from 1 to n.
 * </p>
 * <p>
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
 * For numbers which are multiples of both three and five output “FizzBuzz”.
 * </p>
 */
public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();

        for (int i = 1; i < n + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add("" + i);
            }
        }
        return res;
    }
}