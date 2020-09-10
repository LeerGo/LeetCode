//258 - 各位相加	 

//给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。 
//
// 示例: 
//
// 输入: 38
//输出: 2 
//解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
// 
//
// 进阶: 
//你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？ 
// Related Topics 数学 
// 👍 276 👎 0

package me.leergo.leetcode.editor.cn;

public class AddDigits_258 {
    public static void main(String[] args) {
        Solution solution = new AddDigits_258().new Solution();
        System.out.println(solution.addDigits(38));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /*
        
        num = 1000a + 100b + 10c + d
        target = a + b + c + d
        diff = 999a + 999b + 9c
        diff % 9 == 0
       
        target 为相加后的一位或多位数，重复上述逻辑，最后可以得出
        taget = num % 9
       
         */
        public int addDigits(int num) {
            if (num > 9) {
                num = num % 9;
                if (num == 0) {
                    return 9;
                }
            }
            
            return num;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}