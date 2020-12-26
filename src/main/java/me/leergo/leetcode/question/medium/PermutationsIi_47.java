//47 - 全排列 II	 

//给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。 
//
// 示例 1： 
// 输入：nums = [1,1,2]
// 输出：[[1,1,2], [1,2,1], [2,1,1]]
//
// 示例 2：
// 输入：nums = [1,2,3]
// 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
//
// 提示： 
// 1 <= nums.length <= 8
// -10 <= nums[i] <= 10 
// 
// Related Topics 回溯算法 
// 👍 548 👎 0

package me.leergo.leetcode.question.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PermutationsIi_47 {
    public static void main(String[] args) {
        Solution solution = new PermutationsIi_47().new Solution();
        System.out.println(solution.permuteUnique(new int[]{1, 1, 2}));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        boolean[] isUse;
        List<List<Integer>> res = new ArrayList<>();
        
        public List<List<Integer>> permuteUnique(int[] nums) {
            isUse = new boolean[nums.length];
            Arrays.sort(nums);
            LinkedList<Integer> track = new LinkedList<>();
            backtrack(nums, track);
            return res;
        }
        
        private void backtrack(int[] nums, LinkedList<Integer> track) {
            if (track.size() == nums.length) {
                res.add(new ArrayList<>(track));
                return;
            }
            
            for (int i = 0; i < nums.length; i++) {
                if (isUse[i] || (i > 0 && nums[i] == nums[i - 1] && !isUse[i - 1]))
                    continue;
                track.add(nums[i]);
                isUse[i] = true;
                backtrack(nums, track);
                track.removeLast();
                isUse[i] = false;
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}