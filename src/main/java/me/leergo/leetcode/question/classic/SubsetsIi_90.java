//90 - 子集 II	 

//给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。 
//
// 说明：解集不能包含重复的子集。 
//
// 示例: 
//
// 输入: [1,2,2]
//输出:
//[
//  [2],
//  [1],
//  [1,2,2],
//  [2,2],
//  [1,2],
//  []
//] 
// Related Topics 数组 回溯算法 
// 👍 360 👎 0
package me.leergo.leetcode.question.classic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SubsetsIi_90 {
    public static void main(String[] args) {
        Solution solution = new SubsetsIi_90().new Solution();
        //        System.out.println(solution.subsetsWithDup(new int[]{1, 2, 2}));
        //        System.out.println(solution.subsetsWithDup(new int[]{1, 2, 2, 2}));
        System.out.println(solution.subsetsWithDup(new int[]{4, 4, 4, 1, 4}));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private final List<List<Integer>> res = new ArrayList<>();
        private final LinkedList<Integer> path = new LinkedList<>();
        
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            if (null == nums || nums.length == 0) {
                return res;
            }
            res.add(new ArrayList<>());
            Arrays.sort(nums);
            for (int i = 1; i <= nums.length; i++) {
                dfs(nums, i, 0);
            }
            return res;
        }
        
        private void dfs(int[] nums, int childLen, int idx) {
            if (path.size() == childLen) {
                res.add((List<Integer>) path.clone());
                return;
            }
            
            for (int i = idx; i < nums.length; i++) {
                if (i > idx && nums[i] == nums[i - 1]) continue;
                path.add(nums[i]);
                dfs(nums, childLen, i + 1);
                path.removeLast();
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}