//374 - 猜数字大小	 

//猜数字游戏的规则如下： 
//
// 
// 每轮游戏，系统都会从 1 到 n 随机选择一个数字。 请你猜选出的是哪个数字。 
// 如果你猜错了，系统会告诉你，你猜测的数字比系统选出的数字是大了还是小了。 
// 
//
// 你可以通过调用一个预先定义好的接口 guess(int num) 来获取猜测结果，返回值一共有 3 种可能的情况（-1，1 或 0）： 
//
// -1 : 你猜测的数字比系统选出的数字大
// 1 : 你猜测的数字比系统选出的数字小
// 0 : 恭喜！你猜对了！
// 
//
// 
//
// 示例 : 
//
// 输入: n = 10, pick = 6
//输出: 6 
// Related Topics 二分查找 
// 👍 81 👎 0

package me.leergo.leetcode.question.easy;

public class GuessNumberHigherOrLower_374 {
    public static void main(String[] args) {
        Solution solution = new GuessNumberHigherOrLower_374().new Solution();
        System.out.println(solution.guessNumber(10));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    public class Solution extends GuessGame {
        public int guessNumber(int n) {
            int left = 1;
            int right = n;
            
            while (left < n) {
                int mid = left + (right - left) / 2;
                if (guess(mid) == 0) return mid;
                if (guess(mid) == -1) right = mid - 1;
                else left = mid + 1;
            }
            return n;
        }
    }
    
    //leetcode submit region end(Prohibit modification and deletion)
    class GuessGame {
        final int pick = 6;
        
        int guess(int num) {
            if (num == pick) return 0;
            if (num > pick) return -1;
            return 1;
        }
    }
}