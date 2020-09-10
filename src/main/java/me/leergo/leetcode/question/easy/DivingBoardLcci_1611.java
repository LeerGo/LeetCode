//面试题 16.11 - 跳水板	 

// 你正在使用一堆木板建造跳水板。有两种类型的木板，其中长度较短的木板长度为shorter，
// 长度较长的木板长度为longer。你必须正好使用k块木板。编写一个方法，生成跳水板所有可能的长度。
//
// 返回的长度需要从小到大排列。 
//
// 示例 1 
//
// 输入：
//shorter = 1
//longer = 2
//k = 3
//输出： [3,4,5,6]
//解释：
//可以使用 3 次 shorter，得到结果 3；使用 2 次 shorter 和 1 次 longer，得到结果 4 。以此类推，得到最终结果。 
//
// 提示： 
//
// 
// 0 < shorter <= longer 
// 0 <= k <= 100000 
// 
// Related Topics 递归 记忆化 
// 👍 68 👎 0

package me.leergo.leetcode.question.easy;

import java.util.Arrays;

public class DivingBoardLcci_1611 {
    public static void main(String[] args) {
        Solution solution = new DivingBoardLcci_1611().new Solution();
        System.out.println(Arrays.toString(solution.divingBoard(1, 1, 100000)));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    /*
    最短: shorter * k
    第二短: shorter * k + (longer - shorter) * 1
    第三短: shorter * k + (longer - shorter) * 2
    ...
    最长:shorter * k + (longer - shorter) * k = (longger - shorter + shorter) * k = longger * k
    */
    class Solution {
        public int[] divingBoard(int shorter, int longer, int k) {
            if (k == 0) return new int[]{};
            else if (shorter == longer) return new int[]{shorter * k};
            else {
                int[] res = new int[k + 1];
                for (int i = 0; i <= k; i++) res[i] = shorter * (k - i) + longer * i;
                return res;
            }
        }
        
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}