package me.leergo.medium._537;

/**
 * <h1>537. Complex Number Multiplication</h1>
 *
 * <b>create time : </b>2017-07-06 09:48:58<br>
 * <b>create by</b> : LeerGo!
 *
 * <p>
 * Given two strings representing two complex numbers.
 * You need to return a string representing their multiplication. Note i2 = -1 according to the definition.
 * </p>
 *
 * <p>
 * 题目意思为：复数乘<br>
 * i^2 = -1<br>
 * z1 = a+bi<br>
 * z2 = c+di<br>
 * z1*z2 = (a+bi)*(c+di) = ac+adi+bci+bdi^2 =  (ac－bd)+(bc+ad)i
 * </p>
 */
public class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int a = Integer.parseInt(num1.substring(0, num1.indexOf("+")));
        int b = Integer.parseInt(num1.substring(num1.indexOf("+") + 1, num1.indexOf("i")));
        int c = Integer.parseInt(num2.substring(0, num2.indexOf("+")));
        int d = Integer.parseInt(num2.substring(num2.indexOf("+") + 1, num2.indexOf("i")));

        return (a * c - b * d) + "+" + (b * c + a * d) + "i";
    }
}