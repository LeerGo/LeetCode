//268 - 缺失数字	 

//给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。 
//
// 
//
// 示例 1: 
//
// 输入: [3,0,1]
//输出: 2
// 
//
// 示例 2: 
//
// 输入: [9,6,4,2,3,5,7,0,1]
//输出: 8
// 
//
// 
//
// 说明: 
//你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现? 
// Related Topics 位运算 数组 数学 
// 👍 307 👎 0

package me.leergo.leetcode.question.easy;

import java.util.Arrays;

public class MissingNumber_268 {
    public static void main(String[] args) {
        Solution solution = new MissingNumber_268().new Solution();
        int[] data = new int[]{0, 1};
        System.out.println(solution.missingNumber(data));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int missingNumber(int[] nums) {
            if (nums.length == 1) {
                if (nums[0] == 0) return 1;
                else return nums[0] - 1;
            }
            
            Arrays.sort(nums);
            if (nums[0] != 0) return nums[0] - 1;
            
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != i) return i;
            }
            return nums.length;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}