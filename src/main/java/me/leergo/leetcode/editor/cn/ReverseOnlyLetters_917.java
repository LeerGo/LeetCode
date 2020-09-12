//917 - 仅仅反转字母	 

//给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 输入："ab-cd"
//输出："dc-ba"
// 
//
// 示例 2： 
//
// 输入："a-bC-dEf-ghIj"
//输出："j-Ih-gfE-dCba"
// 
//
// 示例 3： 
//
// 输入："Test1ng-Leet=code-Q!"
//输出："Qedo1ct-eeLg=ntse-T!"
// 
//
// 
//
// 提示： 
//
// 
// S.length <= 100 
// 33 <= S[i].ASCIIcode <= 122 
// S 中不包含 \ or " 
// 
// Related Topics 字符串 
// 👍 61 👎 0

package me.leergo.leetcode.editor.cn;

public class ReverseOnlyLetters_917 {
    public static void main(String[] args) {
        Solution solution = new ReverseOnlyLetters_917().new Solution();
//        System.out.println(solution.reverseOnlyLetters("7_28"));
                System.out.println(solution.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseOnlyLetters(String S) {
            char[] chars = S.toCharArray();
            int left = 0;
            int right = chars.length - 1;
            
            while (left < right) {
                boolean f1 = Character.isLetter(chars[left]);
                boolean f2 = Character.isLetter(chars[right]);
                if (f1 && f2) swap(chars, left, right);
                if (f1) right--;
                if (f2) left++;
                if (!f1 && !f2) {
                    right--;
                    left++;
                }
            }
            
            return String.valueOf(chars);
        }
        
        private void swap(char[] chars, int left, int right) {
            char t = chars[left];
            chars[left] = chars[right];
            chars[right] = t;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}