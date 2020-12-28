//40 - 组合总和 II	 

// 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
// candidates 中的每个数字在每个组合中只能使用一次。
//
// 说明： 
// 所有数字（包括目标数）都是正整数。
// 解集不能包含重复的组合。 
//
// 示例 1: 
// 输入: candidates = [10,1,2,7,6,1,5], target = 8,
// 所求解集为:
// [
//  [1, 7],
//  [1, 2, 5],
//  [2, 6],
//  [1, 1, 6]
// ]
//
// 示例 2: 
// 输入: candidates = [2,5,2,1,2], target = 5,
// 所求解集为:
// [
//  [1,2,2],
//  [5]
// ]
// Related Topics 数组 回溯算法 
// 👍 463 👎 0

package me.leergo.leetcode.question.classic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumIi_40 {
    public static void main(String[] args) {
        Solution solution = new CombinationSumIi_40().new Solution();
        int[] data = new int[]{10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        System.out.println(solution.combinationSum2(data, target));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private final List<List<Integer>> res = new ArrayList<>();
        private final LinkedList<Integer> track = new LinkedList<>();
        
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            backtrack(candidates, target, 0);
            return res;
        }
        
        private void backtrack(int[] candidates, int target, int idx) {
            if (target == 0) {
                res.add(new ArrayList<>(track));
                return;
            }
            for (int i = idx; i < candidates.length; i++) {
                // 判断左右去重 - 剪枝
                if (i > idx && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                
                int diff = target - candidates[i];
                
                if (diff >= 0) {
                    track.add(candidates[i]);
                    // 不允许重复使用，从下一位开始
                    backtrack(candidates, diff, i + 1);
                    track.removeLast();
                } else {
                    break;
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}