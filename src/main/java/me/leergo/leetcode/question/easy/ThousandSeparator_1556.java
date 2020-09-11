//1556 - 千位分隔数	 

//给你一个整数 n，请你每隔三位添加点（即 "." 符号）作为千位分隔符，并将结果以字符串格式返回。 
//
// 
//
// 示例 1： 
//
// 输入：n = 987
//输出："987"
// 
//
// 示例 2： 
//
// 输入：n = 1234
//输出："1.234"
// 
//
// 示例 3： 
//
// 输入：n = 123456789
//输出："123.456.789"
// 
//
// 示例 4： 
//
// 输入：n = 0
//输出："0"
// 
//
// 
//
// 提示： 
//
// 
// 0 <= n < 2^31 
// 
// Related Topics 字符串 
// 👍 1 👎 0

package me.leergo.leetcode.question.easy;

public class ThousandSeparator_1556 {
    public static void main(String[] args) {
        Solution solution = new ThousandSeparator_1556().new Solution();
        System.out.println(solution.thousandSeparator(100000));
        //        System.out.println(999 / 1000);
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String thousandSeparator(int n) {
            String num = String.valueOf(n);
            StringBuilder sb = new StringBuilder();
            int len = num.length();
            for (int i = len - 1; i >= 0; i--) {
                sb.append(num.charAt(i));
                if ((len - i) % 3 == 0 && i != 0) sb.append(".");
            }
            return sb.reverse().toString();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}