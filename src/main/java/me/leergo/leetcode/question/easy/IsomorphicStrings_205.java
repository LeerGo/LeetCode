//205 - 同构字符串	 

//给定两个字符串 s 和 t，判断它们是否是同构的。 
//
// 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。 
//
// 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。 
//
// 示例 1: 
//
// 输入: s = "egg", t = "add"
//输出: true
// 
//
// 示例 2: 
//
// 输入: s = "foo", t = "bar"
//输出: false 
//
// 示例 3: 
//
// 输入: s = "paper", t = "title"
//输出: true 
//
// 说明: 
//你可以假设 s 和 t 具有相同的长度。 
// Related Topics 哈希表 
// 👍 235 👎 0

package me.leergo.leetcode.question.easy;

public class IsomorphicStrings_205 {
    public static void main(String[] args) {
        Solution solution = new IsomorphicStrings_205().new Solution();
        System.out.println(solution.isIsomorphic("ab", "aa"));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            return canMap(s, t) && canMap(t, s);
        }
        
        /*
        将字母的 ASCII 码映射为坐标，另一组字符串映射为对应的值
        非常巧妙的思路 NICE
        */
        private boolean canMap(String s, String t) {
            int[] map = new int[128];
            char[] sChar = s.toCharArray();
            char[] tChar = t.toCharArray();
            
            for (int i = 0; i < sChar.length; i++) {
                if (map[sChar[i]] == 0) {
                    map[sChar[i]] = tChar[i];
                } else {
                    if (map[sChar[i]] != tChar[i])
                        return false;
                }
            }
            
            return true;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}