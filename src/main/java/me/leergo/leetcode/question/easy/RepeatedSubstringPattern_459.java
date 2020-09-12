//459 - 重复的子字符串	 

//给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。 
//
// 示例 1: 
//
// 
//输入: "abab"
//
//输出: True
//
//解释: 可由子字符串 "ab" 重复两次构成。
// 
//
// 示例 2: 
//
// 
//输入: "aba"
//
//输出: False
// 
//
// 示例 3: 
//
// 
//输入: "abcabcabcabc"
//
//输出: True
//
//解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
// 
// Related Topics 字符串 
// 👍 357 👎 0

package me.leergo.leetcode.question.easy;

public class RepeatedSubstringPattern_459 {
    public static void main(String[] args) {
        Solution solution = new RepeatedSubstringPattern_459().new Solution();
        System.out.println(solution.repeatedSubstringPattern("babbabbabbabbab"));
    }
    
    
    //leetcode submit region begin(Prohibit modification and deletion)
    
    /**
     * 正规套路应该用 kmp 剪枝，然鹅我还没学会
     */
    class Solution {
        public boolean repeatedSubstringPattern(String s) {
            //            int len = s.length();
            //            if (len == 2) return s.charAt(0) == s.charAt(1);
            //
            //            int target = s.length() / 2;
            //            StringBuilder sb = new StringBuilder();
            //            String sub;
            //            int times;
            //
            //            for (int i = target; i > 0; i--) {
            //                sb.delete(0, sb.length());
            //                sub = s.substring(0, i);
            //                times = len / sub.length();
            //
            //                for (int j = times; j > 0; j--) {
            //                    sb.append(sub);
            //                }
            //                if (sb.toString().equals(s)) {
            //                    return true;
            //                }
            //            }
            //
            //            return false;
            /**
             * 这个思路很巧妙，如果是重复组成的，那么两个S拼接之后，S 在新的字符串中的起始位置必然
             * 不等于自身长度
             */
            return (s + s).indexOf(s, 1) != s.length();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}