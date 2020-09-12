//389 - 找不同	 

//给定两个字符串 s 和 t，它们只包含小写字母。 
//
// 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。 
//
// 请找出在 t 中被添加的字母。 
//
// 
//
// 示例: 
//
// 输入：
//s = "abcd"
//t = "abcde"
//
//输出：
//e
//
//解释：
//'e' 是那个被添加的字母。
// 
// Related Topics 位运算 哈希表 
// 👍 153 👎 0

package me.leergo.leetcode.question.easy;

public class FindTheDifference_389 {
    public static void main(String[] args) {
        Solution solution = new FindTheDifference_389().new Solution();
        System.out.println(solution.findTheDifference("azcbd", "azcdbe"));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    /*
    字符只有一处不同，转 int 累加后的差值就是不同的字符
    */
    class Solution {
        public char findTheDifference(String s, String t) {
            char[] sc = s.toCharArray();
            char[] tc = t.toCharArray();
            int ssc = 0;
            int stc = 0;
            
            for (char c : sc) {
                ssc += c;
            }
            for (char c : tc) {
                stc += c;
            }
            
            return (char) (stc - ssc);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    /*class Solution {
        public char findTheDifference(String s, String t) {
            char[] sc = s.toCharArray();
            char[] tc = t.toCharArray();
            Arrays.sort(sc);
            Arrays.sort(tc);
        
            int index = tc.length - 1;
            for (int i = 0; i < sc.length; i++) {
                if ((sc[i] ^ tc[i]) != 0) {
                    index = i;
                    break;
                }
            }
        
            return tc[index];
        }
    }*/
}