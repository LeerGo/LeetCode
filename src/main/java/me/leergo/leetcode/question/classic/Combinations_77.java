//77 - 组合	 

//给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。 
//
// 示例: 
//
// 输入: n = 4, k = 2
//输出:
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//] 
// Related Topics 回溯算法 
// 👍 461 👎 0

package me.leergo.leetcode.question.classic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combinations_77 {
    public static void main(String[] args) {
        Solution solution = new Combinations_77().new Solution();
        System.out.println(solution.combine(7, 4));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private final List<List<Integer>> res = new ArrayList<>();
        private final LinkedList<Integer> track = new LinkedList<>();
        
        public List<List<Integer>> combine(int n, int k) {
            if (n <= 0 || k > n) return res;
            
            dfs(n, k, 1);
            
            return res;
        }
        
        private void dfs(int n, int k, int idx) {
            if (track.size() == k) {
                res.add((List<Integer>) track.clone());
                return;
            }
            // i 的起始为 1，所以结束值+1
            // k-track.size：剪枝，减掉了剩余数字全选上也凑不足目标长度的情况
            for (int i = idx; i <= n - (k - track.size()) + 1; i++) {
                track.add(i);
                System.out.println("递归之前 => " + track);
                dfs(n, k, i + 1);
                track.removeLast();
                System.out.println("递归之后 => " + track);
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}