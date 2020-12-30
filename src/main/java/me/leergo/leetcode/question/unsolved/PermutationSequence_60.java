//60 - 排列序列	 

//给出集合 [1,2,3,...,n]，其所有元素共有 n! 种排列。 
//
// 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下： 
//
// 
// "123" 
// "132" 
// "213" 
// "231" 
// "312" 
// "321" 
// 
//
// 给定 n 和 k，返回第 k 个排列。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3, k = 3
//输出："213"
// 
//
// 示例 2： 
//
// 
//输入：n = 4, k = 9
//输出："2314"
// 
//
// 示例 3： 
//
// 
//输入：n = 3, k = 1
//输出："123"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 9 
// 1 <= k <= n! 
// 
// Related Topics 数学 回溯算法 
// 👍 451 👎 0
/*

1234
1243
1324
1342
1423
1432

2134
2143
2314
2341
2413
2431

3124
3142
3214
3241
3412
3421

4123
4132
4213
4231
4312
4321

*/
package me.leergo.leetcode.question.unsolved;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PermutationSequence_60 {
    public static void main(String[] args) {
        Solution solution = new PermutationSequence_60().new Solution();
        System.out.println(solution.getPermutation(7, 1324));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private final List<List<Integer>> res = new ArrayList<>();
        private final LinkedList<Integer> track = new LinkedList<>();
        
        public String getPermutation(int n, int k) {
            k--;
            StringBuilder sbNum = new StringBuilder();
            
            int[] fac = new int[n];
            fac[0] = 1;
            for (int i = 1; i < n; i++) {
                fac[i] = i * fac[i - 1];
            }
            
            List<Integer> nums = IntStream.range(1, n + 1).boxed().collect(Collectors.toList());
            
            for (int i = n - 1; i >= 0; i--) {
                int idx = k / fac[i];
                sbNum.append(nums.remove(idx));
                k -= idx * fac[i];
            }
            
            return sbNum.toString();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}