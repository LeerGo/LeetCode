//922 - 按奇偶排序数组 II	 

//给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。 
//
// 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。 
//
// 你可以返回任何满足上述条件的数组作为答案。 
//
// 
//
// 示例： 
//
// 输入：[4,2,5,7]
//输出：[4,5,2,7]
//解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
// 
//
// 
//
// 提示： 
//
// 
// 2 <= A.length <= 20000 
// A.length % 2 == 0 
// 0 <= A[i] <= 1000 
// 
//
// 
// Related Topics 排序 数组 
// 👍 119 👎 0

package me.leergo.leetcode.question.easy;

import java.util.Arrays;

public class SortArrayByParityIi_922 {
    public static void main(String[] args) {
        Solution solution = new SortArrayByParityIi_922().new Solution();
        System.out.println(Arrays.toString(solution.sortArrayByParityII(new int[]{4, 2, 5, 7})));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortArrayByParityII(int[] A) {
            int oddIndex = 1;
            int evenIndex = 0;
            int[] result = new int[A.length];
            for (int tem : A) {
                if (tem % 2 == 0) {
                    result[evenIndex] = tem;
                    evenIndex += 2;
                } else {
                    result[oddIndex] = tem;
                    oddIndex += 2;
                }
            }
            return result;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}