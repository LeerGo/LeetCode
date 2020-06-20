package me.leergo.leetcode.question.easy._541;

public class ReverseStringII {
    public static void main(String[] args) {
        String str = "hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl";
//        String str = "hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdf ehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjql imjkfnqcqnajmebeddqsgl";
//                     "fdcqkmxwholhytmhafpesaentdvxginrjlyqzyh ehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjql lgsqddebemjanqcqnfkjmi";
//                     "fdcqkmxwholhytmhafpesaentdvxginrjlyqzyh ehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjql lgsqddebemjanqcqnfkjmi"
//                     "fdcqkmxwholhytmhafpesaentdvxginrjlyqzyh ehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjql imjkfnqcqnajmebeddqsgl"
        int    key = 39;

//        System.out.println(str.length());
//        System.out.println(new Solution().reverseStr("abcdefg", 2));
//        System.out.println(new Solution().reverseStr("abcdefg", 8));
        System.out.println(new Solution().reverseStr(str, key));

    }
}