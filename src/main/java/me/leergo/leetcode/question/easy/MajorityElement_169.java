//169 - 多数元素	 

//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。 
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。 
//
// 
//
// 示例 1: 
//
// 输入: [3,2,3]
//输出: 3 
//
// 示例 2: 
//
// 输入: [2,2,1,1,1,2,2]
//输出: 2
// 
// Related Topics 位运算 数组 分治算法 
// 👍 728 👎 0

package me.leergo.leetcode.question.easy;

public class MajorityElement_169 {
    public static void main(String[] args) {
        Solution solution = new MajorityElement_169().new Solution();
        int[] data = new int[]{2, 2, 1, 1, 1, 2, 2};
        System.out.println(solution.majorityElement(data));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int majorityElement(int[] nums) {
            // 常规思路
            //            int flag = nums.length >> 1;
            //            HashMap<Integer, Integer> map = new HashMap<>();
            //            for (int num : nums) {
            //                map.merge(num, 1, (ov, nv) -> ov + nv);
            //            }
            //
            //            for (Integer key : map.keySet()) {
            //                if (map.get(key) > flag) {
            //                    return key;
            //                }
            //            }
            //
            //            return -1;
            
            // 如果会存在半数以上的多数元素，那么可以排序后直接进行半数取值，很巧妙的思路
//            Arrays.sort(nums);
//            return nums[nums.length >> 1];

            // 摩尔投票法，不同的值一换一对拼，剩下的就是最多的
            int vote = 0, res = 0;
            for (int num : nums) {
                if (vote == 0) res = num;
                vote += res == num ? -1 : 1;
            }
            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}