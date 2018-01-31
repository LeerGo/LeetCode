package me.leergo.easy._557;

class Solution {

    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        char[] chars = s.toCharArray();
        int    i     = 0;
        while (i < chars.length) {
            int index = s.indexOf(' ', i);
            if (index == -1) {
                reverse(chars, i, chars.length - 1);
                break;
            }
            reverse(chars, i, index - 1);

            i = index + 1;
        }

        return new String(chars);
    }

    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;

        }
    }

//    public String reverseWords(String s) {
//        String[]      splitStrs = s.split(" ");
//        StringBuilder sb        = new StringBuilder();
//
//        for (int i = 0; i < splitStrs.length; i++) {
//            if (i != splitStrs.length - 1) {
//                sb.append(new StringBuilder(splitStrs[i]).reverse().append(" ").toString());
//            } else {
//                sb.append(new StringBuilder(splitStrs[i]).reverse().toString());
//            }
//        }
//        return sb.toString();
//    }
}