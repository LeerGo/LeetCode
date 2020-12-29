//78 - 子集	 

//给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。 
//
// 说明：解集不能包含重复的子集。 
//
// 示例: 
//
// 输入: nums = [1,2,3]
//输出:
//[
// [3],
// [1],
// [2],
// [1,2,3],
// [1,3],
// [2,3],
// [1,2],
// []
//] 
// Related Topics 位运算 数组 回溯算法 
// 👍 927 👎 0

package me.leergo.leetcode.question.classic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets_78 {
    public static void main(String[] args) {
        Solution solution = new Subsets_78().new Solution();
        System.out.println(solution.subsets(new int[]{1, 2, 3}));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private final List<List<Integer>> res = new ArrayList<>();
        private final LinkedList<Integer> path = new LinkedList<>();
        
        public List<List<Integer>> subsets(int[] nums) {
            if (null == nums || nums.length == 0) return res;
            int len = nums.length;
            
            res.add(new ArrayList<>());
            for (int i = 1; i < len + 1; i++) {
                dfs(nums, i, 0);
            }
            return res;
        }
        
        private void dfs(int[] nums, int childLen, int idx) {
            if (path.size() == childLen) {
                res.add((List<Integer>) path.clone());
                return;
            }
            for (int i = idx; i < nums.length - (childLen - path.size()) + 1; i++) {
                path.add(nums[i]);
                dfs(nums, childLen, i + 1);
                path.removeLast();
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}