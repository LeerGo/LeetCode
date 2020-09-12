//387 - 字符串中的第一个唯一字符	 

//给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。 
//
// 
//
// 示例： 
//
// s = "leetcode"
//返回 0
//
//s = "loveleetcode"
//返回 2
// 
//
// 
//
// 提示：你可以假定该字符串只包含小写字母。 
// Related Topics 哈希表 字符串 
// 👍 265 👎 0

package me.leergo.leetcode.question.easy;

public class FirstUniqueCharacterInAString_387 {
    public static void main(String[] args) {
        Solution solution = new FirstUniqueCharacterInAString_387().new Solution();
        System.out.println(solution.firstUniqChar("leetcode"));
    }
            /*
            tem > -1，字符串中出现该字母
            tem == lastIndex, 判断是否重复出现
            tem < index，判断当前唯一的字母坐标是否比上一个更靠前
            */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int firstUniqChar(String s) {
            int n = s.length();
            if (n == 1) return 0;
            
            int index = n;
            int tem;
            
            for (int i = 'a'; i <= 'z'; i++) {
                tem = s.indexOf(i);
                if (tem > -1 && tem == s.lastIndexOf(i) && tem < index) {
                    index = tem;
                }
            }
            
            if (index == n) return -1;
            return index;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    /*class Solution {
        public int firstUniqChar(String s) {
            if (s.equals("")) return -1;
        
            StringBuilder sb = new StringBuilder();
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                int flag = sb.indexOf(s.substring(i, i + 1));
                if (set.contains(s.charAt(i))) {
                    if (flag != -1) sb.deleteCharAt(flag);
                } else {
                    set.add(s.charAt(i));
                    sb.append(s.charAt(i));
                }
            }
        
            return sb.length() == 0 ? -1 : s.indexOf(sb.charAt(0));
        }
    }*/
}