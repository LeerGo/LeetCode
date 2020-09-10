// 1539 - 第 k 个缺失的正整数
//
//chc 给你一个 严格升序排列 的正整数数组 arr 和一个整数 k 。
//
// 请你找到这个数组里第 k 个缺失的正整数。 
//
// 示例 1： 
//
// 输入：arr = [2,3,4,7,11], k = 5
// 输出：9
// 解释：缺失的正整数包括 [1,5,6,8,9,10,12,13,...] 。第 5 个缺失的正整数为 9 。
// 
//
// 示例 2： 
//
// 输入：arr = [1,2,3,4], k = 2
// 输出：6
// 解释：缺失的正整数包括 [5,6,7,...] 。第 2 个缺失的正整数为 6 。
//
// 提示： 
// 1 <= arr.length <= 1000
// 1 <= arr[i] <= 1000 
// 1 <= k <= 1000 
// 对于所有 1 <= i < j <= arr.length 的 i 和 j 满足 arr[i] < arr[j] 
// 
// Related Topics 数组 哈希表 
// 👍 6 👎 0

package me.leergo.leetcode.question.easy;

public class KthMissingPositiveNumber_1539 {
    public static void main(String[] args) {
        Solution solution = new KthMissingPositiveNumber_1539().new Solution();
        int[] data = new int[]{2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(solution.findKthPositive(data, k));
    }
    
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findKthPositive(int[] arr, int k) {
            // 数组最大值-数组长度表示最多可以缺少的数字有多少
            int max = arr[arr.length - 1] - arr.length;
            if (max < k) {
                // 如果缺少的数字位置最大值小与指定位置，就表明在单枪数组的外侧，直接用最大值来进行运算即可
                return arr[arr.length - 1] + k - max;
            } else {
                // 反之，则在数组内部位置，利用上述思路处理即可
                for (int i = arr.length - 1; i >= 0; i--) {
                    int len = i + 1;
                    int curMax = arr[i] - len;
                    if (arr[i] - len < k) return arr[i] + k - curMax;
                }
            }
            return k;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}