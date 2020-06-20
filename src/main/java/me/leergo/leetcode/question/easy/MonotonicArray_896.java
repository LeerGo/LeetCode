//896 - 单调数列	 

//如果数组是单调递增或单调递减的，那么它是单调的。 
//
// 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是
//单调递减的。 
//
// 当给定的数组 A 是单调数组时返回 true，否则返回 false。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 输入：[1,2,2,3]
//输出：true
// 
//
// 示例 2： 
//
// 输入：[6,5,4,4]
//输出：true
// 
//
// 示例 3： 
//
// 输入：[1,3,2]
//输出：false
// 
//
// 示例 4： 
//
// 输入：[1,2,4,5]
//输出：true
// 
//
// 示例 5： 
//
// 输入：[1,1,1]
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 1 <= A.length <= 50000 
// -100000 <= A[i] <= 100000 
// 
// Related Topics 数组

package me.leergo.leetcode.question.easy;

public class MonotonicArray_896 {
    public static void main(String[] args) {
        Solution solution = new MonotonicArray_896().new Solution();
        int[] a = new int[]{1, 2, 2, 3};
        int[] b = new int[]{6, 5, 4, 4};
        int[] c = new int[]{1, 3, 2};
        int[] d = new int[]{1, 2, 4, 5};
        int[] e = new int[]{1, 1, 1};
        int[] f = new int[]{1, 1, 0};
        int[] g = new int[]{1, 3};
        System.out.println(solution.isMonotonic(a));
        System.out.println(solution.isMonotonic(b));
        System.out.println(solution.isMonotonic(c));
        System.out.println(solution.isMonotonic(d));
        System.out.println(solution.isMonotonic(e));
        System.out.println(solution.isMonotonic(f));
        System.out.println(solution.isMonotonic(g));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isMonotonic(int[] a) {
            boolean grow = a[0] <= a[a.length - 1];
            for (int i = 0; i < a.length - 1; i++) {
                if (grow) {
                    if (a[i] > a[i + 1]) {
                        return false;
                    }
                } else {
                    if (a[i] < a[i + 1]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}