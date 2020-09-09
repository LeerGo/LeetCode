//14 - 最长公共前缀	 

//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串 
// 👍 1250 👎 0

package me.leergo.leetcode.question.easy;

import java.util.Arrays;

public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix_14().new Solution();
        String[] data = new String[]{"flower", "flow", "flight"};
        System.out.println(solution.longestCommonPrefix(data));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) return "";
            if (strs.length == 1) return strs[0];
            int len = strs.length;
            Arrays.sort(strs);
            String a = strs[0];
            String b = strs[len - 1];
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == b.charAt(i)) {
                    sb.append(a.charAt(i));
                } else {
                    break;
                }
            }
            return sb.toString();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}