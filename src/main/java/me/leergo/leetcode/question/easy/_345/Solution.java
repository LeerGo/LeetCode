package me.leergo.leetcode.question.easy._345;

class Solution {
    private static boolean[] marked = new boolean[256];

    static {
        marked['u'] = true;
        marked['e'] = true;
        marked['o'] = true;
        marked['a'] = true;
        marked['i'] = true;
        marked['U'] = true;
        marked['E'] = true;
        marked['O'] = true;
        marked['A'] = true;
        marked['I'] = true;
    }

    public String reverseVowels(String s) {
        int    left  = 0, right = s.length() - 1;
        char[] chars = s.toCharArray();

        while (left < right) {
            if (marked[chars[left]] && marked[chars[right]]) {
                chars = swap(chars, left, right);
                left++;
                right--;
            } else if (marked[chars[left]]) {
                --right;
            } else {
                ++left;
            }
        }

        return new String(chars);
    }

//    private boolean isVowels(char c) {
//        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
//               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
//    }

    private char[] swap(char[] chars, int a, int b) {
        chars[a] = (char) (chars[a] + chars[b]);
        chars[b] = (char) (chars[a] - chars[b]);
        chars[a] = (char) (chars[a] - chars[b]);
        return chars;
    }
}