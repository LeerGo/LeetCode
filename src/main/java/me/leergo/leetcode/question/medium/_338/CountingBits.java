package me.leergo.leetcode.question.medium._338;

public class CountingBits {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i%10==0)
                System.out.println();
            System.out.println("i = "+ i + " -- " + Integer.toBinaryString(i));
        }
    }
}
