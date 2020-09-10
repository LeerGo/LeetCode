//231 - 2的幂	 

//给定一个整数，编写一个函数来判断它是否是 2 的幂次方。 
//
// 示例 1: 
//
// 输入: 1
//输出: true
//解释: 20 = 1 
//
// 示例 2: 
//
// 输入: 16
//输出: true
//解释: 24 = 16 
//
// 示例 3: 
//
// 输入: 218
//输出: false 
// Related Topics 位运算 数学 
// 👍 239 👎 0

package me.leergo.leetcode.question.easy;

public class PowerOfTwo_231 {
    public static void main(String[] args) {
        Solution solution = new PowerOfTwo_231().new Solution();
        System.out.println(solution.isPowerOfTwo(1073741825));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPowerOfTwo(int n) {
            //            if (n == 0) return false;
            //            while (n % 2 == 0) n /= 2;
            //            return n == 1;
            
            /*
            二进制如下：
            2^2   = 4 = 100
            2^2-1 = 3 = 011
            
            与运算：
                      100
                    & 011
                    -----
                      000
            又，2^x > 0
            故此，得出下面解答
            */
            return (n > 0) && (n & (n - 1)) == 0;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}