//414 - 第三大的数	 

//给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。 
//
// 示例 1: 
//
// 
//输入: [3, 2, 1]
//
//输出: 1
//
//解释: 第三大的数是 1.
// 
//
// 示例 2: 
//
// 
//输入: [1, 2]
//
//输出: 2
//
//解释: 第三大的数不存在, 所以返回最大的数 2 .
// 
//
// 示例 3: 
//
// 
//输入: [2, 2, 3, 1]
//
//输出: 1
//
//解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
//存在两个值为2的数，它们都排第二。
// 
// Related Topics 数组 
// 👍 162 👎 0

package me.leergo.leetcode.question.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThirdMaximumNumber_414 {
    public static void main(String[] args) {
        Solution solution = new ThirdMaximumNumber_414().new Solution();
        int[] data = new int[]{1, 2, 2, 5, 3, 5};
        System.out.println(solution.thirdMax(data));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    
    /**
     * 读题，有点乱……
     */
    class Solution {
        public int thirdMax(int[] nums) {
            Arrays.sort(nums);
            List<Integer> arr = new ArrayList<>();
            
            for (int num : nums) {
                if (!arr.contains(num)) arr.add(num);
            }
            if (arr.size() == 1) return arr.get(0);
            if (arr.size() == 2) return arr.get(1);
            return arr.get(arr.size() - 3);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}