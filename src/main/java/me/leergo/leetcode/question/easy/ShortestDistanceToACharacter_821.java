//821 - 字符的最短距离	 

//给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。 
//
// 示例 1: 
//
// 
//输入: S = "loveleetcode", C = 'e'
//输出: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
// 
//
// 说明: 
//
// 
// 字符串 S 的长度范围为 [1, 10000]。 
// C 是一个单字符，且保证是字符串 S 里的字符。 
// S 和 C 中的所有字母均为小写字母。 
// 
// 👍 149 👎 0

package me.leergo.leetcode.question.easy;

import java.util.Arrays;

public class ShortestDistanceToACharacter_821 {
    public static void main(String[] args) {
        Solution solution = new ShortestDistanceToACharacter_821().new Solution();
        String data = "loveleetcode";
        char flag = 'e';
        System.out.println(Arrays.toString(solution.shortestToChar(data, flag)));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] shortestToChar(String S, char C) {
            char[] chars = S.toCharArray();
            int[] result = new int[S.length()];
            
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == C) {
                    result[i] = 0;
                } else {
                    int left = getLeftIndex(chars, i, C);
                    int right = getRightIndex(chars, i, C);
                    result[i] = Math.min(left, right);
                }
            }
            
            return result;
        }
        
        private int getLeftIndex(char[] chars, int i, char c) {
            int index = Integer.MAX_VALUE;
            for (int j = i; j >= 0; j--) {
                if (chars[j] == c) {
                    index = i - j;
                    break;
                }
            }
            return index;
        }
        
        private int getRightIndex(char[] chars, int i, char c) {
            int index = Integer.MAX_VALUE;
            for (int j = i; j < chars.length; j++) {
                if (chars[j] == c) {
                    index = j - i;
                    break;
                }
            }
            return index;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}