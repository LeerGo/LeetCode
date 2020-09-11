//367 - 有效的完全平方数	 

// 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
//
// 说明：不要使用任何内置的库函数，如 sqrt。 
//
// 示例 1： 
// 输入：16
// 输出：True
//
// 示例 2： 
// 输入：14
// 输出：False
// 
// Related Topics 数学 二分查找 
// 👍 168 👎 0

package me.leergo.leetcode.question.easy;

public class ValidPerfectSquare_367 {
    public static void main(String[] args) {
        Solution solution = new ValidPerfectSquare_367().new Solution();
        //        System.out.println(5 << 2);
        System.out.println(solution.isPerfectSquare(5));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPerfectSquare(int num) {
            if (num == 0) return false;
            if (num == 1) return true;
            
            int left = 1;
            int right = num;
            
            while (left <= right) {
                int mid = (left + right) / 2;
                // 会越界
                // double flag = mid * mid;
                int flag = num / mid;

                if (flag == mid) {
                    if (num % flag == 0) return true;
                    left = mid + 1;
                } else if (flag < mid) right = mid - 1;
                else left = mid + 1;
            }
            
            return false;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}