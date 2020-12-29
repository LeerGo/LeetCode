//15 - 三数之和	 

// 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
//
// 注意：答案中不可以包含重复的三元组。 
//
// 示例： 
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
// 满足要求的三元组集合为：
// [
//  [-1, 0, 1],
//  [-1, -1, 2]
// ]
// 
// Related Topics 数组 双指针 
// 👍 2846 👎 0

package me.leergo.leetcode.question.classic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {
    public static void main(String[] args) {
        Solution solution = new ThreeSum_15().new Solution();
        //        int[] data = new int[]{-1, 0, 1, 2, -1, -4};
         int[] data = new int[]{-4, -1, -1, 0, 1, 2};
//        int[] data = new int[]{0, 0, 0};
        System.out.println(solution.threeSum(data));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private List<List<Integer>> res = new ArrayList<>();
        
        public List<List<Integer>> threeSum(int[] nums) {
            int len = nums.length;
            if (nums == null || len < 3) return res;
            Arrays.sort(nums);
            
            for (int i = 0; i < len; i++) {
                if (nums[i] > 0) break; // 如果大于零，则该节点之后的相加肯定不能为 0，直接返回
                if (i > 0 && nums[i] == nums[i - 1]) continue; //去重
                
                int left = i + 1; // i+1  ~ len-1 一个子区间内，双指针遍历求和
                int right = len - 1;
                
                while (left < right) {
                    int sum = nums[left] + nums[right] + nums[i];
                    if (sum == 0) {
                        res.add(Arrays.asList(nums[left], nums[right], nums[i]));
                        while (left < right && nums[left] == nums[left + 1]) left++; // 子区间去重
                        while (left < right && nums[right] == nums[right - 1]) right--; // 同上
                        left++;
                        right--;
                    } else if (sum > 0) {
                        right--;
                    } else {
                        left++;
                    }
                }
                
            }
            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}