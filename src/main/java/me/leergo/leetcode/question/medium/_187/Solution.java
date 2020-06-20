package me.leergo.leetcode.question.medium._187;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <h1>187. Repeated DNA Sequences</h1>
 *
 * <b>create time : </b>2018-01-26 15:29:43<br>
 * <b>create by</b> : LeerGo!
 *
 * <p>
 * All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.
 * <br><br>
 * Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.
 * <br><br>
 * For example,
 * <pre>
 * Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",
 * Return: ["AAAAACCCCC", "CCCCCAAAAA"]
 * </pre>
 * </p>
 *
 * <p>
 * <b>思路</b>
 * <br>
 * 暂无
 * </p>
 */
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String>  strSet  = new HashSet<>();
        List<String> strList = new ArrayList<>();

        for (int i = 0, max = s.length() - 9; i < max; i++) {
            String temp = s.substring(i, i + 10);
            if (!strSet.add(temp) && !strList.contains(temp)) {
                strList.add(temp);
            }
        }

        return strList;
    }
}