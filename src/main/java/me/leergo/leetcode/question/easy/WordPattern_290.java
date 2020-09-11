//290 - 单词规律	 

//给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。 
//
// 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。 
//
// 示例1: 
//
// 输入: pattern = "abba", str = "dog cat cat dog"
//输出: true 
//
// 示例 2: 
//
// 输入:pattern = "abba", str = "dog cat cat fish"
//输出: false 
//
// 示例 3: 
//
// 输入: pattern = "aaaa", str = "dog cat cat dog"
//输出: false 
//
// 示例 4: 
//
// 输入: pattern = "abba", str = "dog dog dog dog"
//输出: false 
//
// 说明: 
//你可以假设 pattern 只包含小写字母， str 包含了由单个空格分隔的小写字母。 
// Related Topics 哈希表 
// 👍 189 👎 0

package me.leergo.leetcode.question.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern_290 {
    public static void main(String[] args) {
        Solution solution = new WordPattern_290().new Solution();
        System.out.println(solution.wordPattern("abba", "dog 1 1 dog"));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean wordPattern(String pattern, String str) {
            String[] data = str.split(" ");
            
            if (data.length != pattern.length())
                return false;
            
            Map record = new HashMap();
            // 这里需要使用 integer 而不是 int
            // int 的话 ，每次都被被 box，对象就不一样了
            // 另一方面，Map 的泛型只能接受对象
            // 综上所属，只能使用 Integer
            //  非要使用 int，需要增加若干判断
            for (Integer i = 0; i < data.length; i++)
                if (record.put(pattern.charAt(i), i) != record.put(data[i], i))
                    return false;
            return true;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}