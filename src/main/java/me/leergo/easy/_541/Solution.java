package me.leergo.easy._541;

class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int    len   = chars.length;
        int    flag  = len / k + 1;

        for (int i = 0; i < flag; i++) {
            int endIndex = (i + 1) * k - 1;
            endIndex = endIndex >= len ? len - 1 : endIndex;

            if (i % 2 == 0) {
                chars = reverse(chars, i * k, endIndex);
            }
        }

        return new String(chars);
    }

    private char[] reverse(char[] chars, int i, int j) {
        while (i < j) {
            chars = swap(chars, i, j);
            i++;
            j--;
        }
        return chars;
    }

    private char[] swap(char[] chars, int i, int j) {
        chars[i] = (char) (chars[i] + chars[j]);
        chars[j] = (char) (chars[i] - chars[j]);
        chars[i] = (char) (chars[i] - chars[j]);

        return chars;
    }
}