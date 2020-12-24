//509 - 斐波那契数	 

//斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是： 
//
// F(0) = 0, F(1) = 1
//F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
// 
//
// 给定 N，计算 F(N)。 
//
// 
//
// 示例 1： 
//
// 输入：2
//输出：1
//解释：F(2) = F(1) + F(0) = 1 + 0 = 1.
// 
//
// 示例 2： 
//
// 输入：3
//输出：2
//解释：F(3) = F(2) + F(1) = 1 + 1 = 2.
// 
//
// 示例 3： 
//
// 输入：4
//输出：3
//解释：F(4) = F(3) + F(2) = 2 + 1 = 3.
// 
//
// 
//
// 提示： 
//
// 
// 0 ≤ N ≤ 30 
// 
// Related Topics 数组 
// 👍 182 👎 0

package me.leergo.leetcode.question.classic;

public class FibonacciNumber_509 {
    public static void main(String[] args) {
        Solution solution = new FibonacciNumber_509().new Solution();
        System.out.println(solution.fib(10));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        // 打表时，很长一段数组空间只用 1 次，每次运算的规律都是：
        // f(n) = f(n-1) + f(n-2)
        // --> ans = cur + pre
        public int fib(int n) {
            if (n <= 0) return 0;
            if (n == 1 || n == 2) return 1;
            
            int prev = 1;
            int cur = 1;
            int ans = 0;
            
            for (int i = 3; i < n + 1; i++) {
                ans = prev + cur;
                prev = cur;
                cur = ans;
            }
            
            return ans;
        }
        
        // 打表正向迭代
        /*public int fib(int n) {
            if (n <= 0) return 0;
            if (n == 1 || n == 2) return 1;
            int[] mem = new int[n + 1];
            mem[1] = mem[2] = 1;
            for (int i = 3; i <= n; i++) {
                mem[i] = mem[i - 1] + mem[i - 2];
            }
            return mem[n];
        }*/
        
        // 备忘录递归解法 - 剪枝
        /*public int fib(int n) {
            if (n <= 0) return 0;
            int[] mem = new int[n + 1];
            return helper(mem, n);
        }
        
        private int helper(int[] mem, int n) {
            if (n == 1 || n == 2) return 1;
            if (mem[n] != 0) return mem[n];
            mem[n] = helper(mem, n - 1) + helper(mem, n - 2);
            return mem[n];
        }*/
        
        // 递归
        /*
        public int fib(int n) {
            if (n == 0) return 0;
            if (n == 1 || n == 2) return 1;
            System.out.println(n);
            return fib(n - 1) + fib(n - 2);
        }
        */
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}