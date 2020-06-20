//66 - 加一	 

//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 示例 1: 
//
// 输入: [1,2,3]
//输出: [1,2,4]
//解释: 输入数组表示数字 123。
// 
//
// 示例 2: 
//
// 输入: [4,3,2,1]
//输出: [4,3,2,2]
//解释: 输入数组表示数字 4321。
// 
// Related Topics 数组

package me.leergo.leetcode.question.easy;

import java.util.Arrays;

public class PlusOne_66 {
    public static void main(String[] args) {
        Solution solution = new PlusOne_66().new Solution();
        System.out.println(Arrays.toString(solution.plusOne(new int[]{8, 9})));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {
                digits[i]++;
                digits[i] = digits[i] % 10;
                if (digits[i]!=0){
                    return digits;
                }
            }
            digits = new int[digits.length+1];
            digits[0]=1;
            return digits;
            
            //            int length = digits.length;
            //            int destination[] = new int[length + 1];
            //            System.arraycopy(digits, 0, destination, 1, length);
            //
            //            for (int i = destination.length - 1; i >= 0; i--) {
            //                if (destination[i] < 9) {
            //                    destination[i] += 1;
            //                    break;
            //                } else {
            //                    destination[i] = 0;
            //                }
            //            }
            //            if (destination[0] == 0) {
            //                return Arrays.copyOfRange(destination, 1, length + 1);
            //            } else {
            //                return destination;
            //            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}