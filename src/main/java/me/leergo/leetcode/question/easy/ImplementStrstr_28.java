//28 - 实现 strStr()	 

//实现 strStr() 函数。 
//
// 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如
//果不存在，则返回 -1。 
//
// 示例 1: 
//
// 输入: haystack = "hello", needle = "ll"
//输出: 2
// 
//
// 示例 2: 
//
// 输入: haystack = "aaaaa", needle = "bba"
//输出: -1
// 
//
// 说明: 
//
// 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。 
//
// 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。 
// Related Topics 双指针 字符串 
// 👍 556 👎 0

package me.leergo.leetcode.question.easy;

public class ImplementStrstr_28 {
    public static void main(String[] args) {
        Solution solution = new ImplementStrstr_28().new Solution();
//        System.out.println(solution.strStr("a",""));
        System.out.println(solution.strStr("aaa","a"));
//        System.out.println(solution.strStr("hello","ll"));
//        System.out.println(solution.strStr("aaaa","bba"));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int strStr(String haystack, String needle) {
            if("".equals(needle)){
                return 0;
            }
    
            int res = -1;
            int len1 = haystack.length();
            int len2 = needle.length();
            
            if (len1 < len2) {
                return res;
            }
            
            for (int i = 0; i <= len1 - len2; i++) {
                if (haystack.substring(i, i + len2).equals(needle)) {
                    res = i;
                    break;
                }
            }
            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}