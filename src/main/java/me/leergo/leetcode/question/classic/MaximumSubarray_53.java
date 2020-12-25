//53 - 最大子序和	 

//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 
//
// 示例: 
//
// 输入: [-2,1,-3,4,-1,2,1,-5,4]
// 输出: 6
// 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
// 
//
// 进阶: 
//
// 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。 
// Related Topics 数组 分治算法 动态规划 
// 👍 2757 👎 0

package me.leergo.leetcode.question.classic;

public class MaximumSubarray_53 {
    public static void main(String[] args) {
        Solution solution = new MaximumSubarray_53().new Solution();
//        System.out.println(solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(solution.maxSubArray(new int[]{1}));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    // 输入: [-2,1,-3,4,-1,2,1,-5,4]
    // 输出: 6
    // 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
    class Solution {
        public int maxSubArray(int[] nums) {
            /*int maxSum = nums[0];
            int curMaxSum = nums[0];
    
            for (int num : nums) {
                curMaxSum = Math.max(num, curMaxSum+num);
//                maxSum = Math.max(curMaxSum, maxSum);
            }
            return maxSum;*/
            
            /*
            int[] mem = new int[nums.length];
            mem[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (mem[i - 1] > 0) mem[i] = mem[i - 1] + nums[i];
                else mem[i] = nums[i];
            }
            return Arrays.stream(mem).max().getAsInt();
            */
            
            /*
            for (int i = 1; i < nums.length; i++) {
                if (nums[i-1]>0) nums[i] = nums[i]+nums[i-1];
            }
            return Arrays.stream(nums).max().getAsInt();
            */
            
            int maxCur = nums[0];
            int max = nums[0];
            for (int i = 0; i < nums.length; i++) {
                maxCur = Math.max(nums[i], maxCur + nums[i]);
                max = Math.max(maxCur, max);
            }
            return max;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}