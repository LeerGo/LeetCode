//884 - 两句话中的不常见单词	 

//给定两个句子 A 和 B 。 （句子是一串由空格分隔的单词。每个单词仅由小写字母组成。） 
//
// 如果一个单词在其中一个句子中只出现一次，在另一个句子中却没有出现，那么这个单词就是不常见的。 
//
// 返回所有不常用单词的列表。 
//
// 您可以按任何顺序返回列表。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 输入：A = "this apple is sweet", B = "this apple is sour"
//输出：["sweet","sour"]
// 
//
// 示例 2： 
//
// 输入：A = "apple apple", B = "banana"
//输出：["banana"]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= A.length <= 200 
// 0 <= B.length <= 200 
// A 和 B 都只包含空格和小写字母。 
// 
// Related Topics 哈希表

package me.leergo.leetcode.question.easy;

import java.util.*;

public class UncommonWordsFromTwoSentences_884 {
    public static void main(String[] args) {
        Solution solution = new UncommonWordsFromTwoSentences_884().new Solution();
        String a = "this apple is sweet";
        String b = "this apple is sour";
        System.out.println(Arrays.toString(solution.uncommonFromSentences(a, b)));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String[] uncommonFromSentences(String a, String b) {
            List<String> res = new ArrayList<>();
            Map<String, Integer> map = new HashMap<>();
            String[] array = (a.trim() + " " + b.trim()).split(" ");
    
            for (String s : array) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
            
            for (String s : map.keySet()) {
                if (map.get(s) == 1) {
                    res.add(s);
                }
            }
            return res.toArray(new String[0]);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}