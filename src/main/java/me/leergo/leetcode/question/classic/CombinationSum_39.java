//39 - 组合总和
//
// 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
// candidates 中的数字可以无限制重复被选取。
//
// 说明： 
// 所有数字（包括 target）都是正整数。
// 解集不能包含重复的组合。 
// 
// 示例 1：
//
// 输入：candidates = [2,3,6,7], target = 7,
// 所求解集为：
// [
//  [7],
//  [2,2,3]
// ]
// 
// 示例 2：
//
// 输入：candidates = [2,3,5], target = 8,
// 所求解集为：
// [
//  [2,2,2,2],
//  [2,3,3],
//  [3,5]
// ]
//
// 提示： 
// 1 <= candidates.length <= 30
// 1 <= candidates[i] <= 200 
// candidate 中的每个元素都是独一无二的。 
// 1 <= target <= 500 
// 
// Related Topics 数组 回溯算法 
// 👍 1100 👎 0

package me.leergo.leetcode.question.classic;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_39 {
    public static void main(String[] args) {
        Solution solution = new CombinationSum_39().new Solution();
        
        //        int[] data = new int[]{2, 3, 6, 7};
        //        int target = 7;
        
        int[] data = new int[]{2, 3, 5};
        int target = 8;
        
        System.out.println(solution.combinationSum(data, target));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private final List<Integer> track = new ArrayList<>();
        private final List<List<Integer>> res = new ArrayList<>();
        
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            backtrack(candidates, target, 0);
            return res;
        }
        
        private void backtrack(int[] candidates, int target, int idx) {
            if (target == 0) {
                res.add(new ArrayList<>(new ArrayList<>(track)));
                return;
            }
            for (int i = idx; i < candidates.length; i++) {
                if (target - candidates[i] >= 0) {
                    track.add(candidates[i]);
                    backtrack(candidates, target - candidates[i], i);
                    track.remove(track.size() - 1);
                }
            }
        }
    }
    
    /*class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> res = new ArrayList<>();
            LinkedList<Integer> track = new LinkedList<>();
            Arrays.sort(candidates);
            backtrack(candidates, target, res, track, 0);
            return res;
        }
        
        private void backtrack(int[] candidates, int target, List<List<Integer>> res, LinkedList<Integer> track, int idx) {
            if (idx == candidates.length) return;
            
            if (target == 0) {
                res.add(new ArrayList<>(track));
                return;
            }
            
            backtrack(candidates, target, res, track, idx + 1);
            
            if (target - candidates[idx] >= 0) {
                track.add(candidates[idx]);
                backtrack(candidates, target - candidates[idx], res, track, idx);
                track.removeLast();
            }
        }
    }*/
    //leetcode submit region end(Prohibit modification and deletion)
    
}