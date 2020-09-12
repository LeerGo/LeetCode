//485 - 最大连续1的个数	 

//给定一个二进制数组， 计算其中最大连续1的个数。 
//
// 示例 1: 
//
// 
//输入: [1,1,0,1,1,1]
//输出: 3
//解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
// 
//
// 注意： 
//
// 
// 输入的数组只包含 0 和1。 
// 输入数组的长度是正整数，且不超过 10,000。 
// 
// Related Topics 数组 
// 👍 120 👎 0

package me.leergo.leetcode.question.easy;

public class MaxConsecutiveOnes_485 {
    public static void main(String[] args) {
        Solution solution = new MaxConsecutiveOnes_485().new Solution();
        System.out.println(solution.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
        //        System.out.println(solution.findMaxConsecutiveOnes(new int[]{0}));
        //        System.out.println(solution.findMaxConsecutiveOnes(new int[]{1}));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int max = 0, count = 0;
            for (int num : nums) {
                if (num == 1) count++;
                else {
                    if (count > max) max = count;
                    count = 0;
                }
            }
            if (count > max) max = count;
            return max;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    /*class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int start = -1;
            int end = -1;
            int len = 0;
        
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    start = -1;
                    end = -1;
                } else if (nums[i] == 1) {
                    if (start == -1) {
                        start = i;
                        end = i;
                    } else {
                        end = i;
                    }
                    len = Math.max(len, end - start + 1);
                }
            }
        
        
            return len;
        }
    }*/
}