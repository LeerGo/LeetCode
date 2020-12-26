//46 - 全排列	 

//给定一个 没有重复 数字的序列，返回其所有可能的全排列。 
//
// 示例: 
//
// 输入: [1,2,3]
//输出:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//] 
// Related Topics 回溯算法 
// 👍 1052 👎 0

package me.leergo.leetcode.question.classic;

import java.util.ArrayList;
import java.util.List;

public class Permutations_46 {
    public static void main(String[] args) {
        Solution solution = new Permutations_46().new Solution();
        System.out.println(solution.permute(new int[]{1, 2, 3}).toString());
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res = new ArrayList<>();
        
        public List<List<Integer>> permute(int[] nums) {
            ArrayList<Integer> track = new ArrayList<>();
            backtrack(nums, track);
            return res;
        }
        
        private void backtrack(int[] nums, ArrayList<Integer> track) {
            if (track.size() == nums.length) {
                res.add(new ArrayList<>(track));
                return;
            }
            
            for (int num : nums) {
                if (track.contains(num)) continue;
                track.add(num);
                backtrack(nums, track);
                // 递归退出后，执行这一步
                track.remove(track.size() - 1);
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}