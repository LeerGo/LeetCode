//1033 - 移动石子直到连续	 

//三枚石子放置在数轴上，位置分别为 a，b，c。 
//
// 每一回合，我们假设这三枚石子当前分别位于位置 x, y, z 且 x < y < z。从位置 x 或者是位置 z 拿起一枚石子，并将该石子移动到某一整数位
//置 k 处，其中 x < k < z 且 k != y。 
//
// 当你无法进行任何移动时，即，这些石子的位置连续时，游戏结束。 
//
// 要使游戏结束，你可以执行的最小和最大移动次数分别是多少？ 以长度为 2 的数组形式返回答案：answer = [minimum_moves, maximu
//m_moves] 
//
// 
//
// 示例 1： 
//
// 输入：a = 1, b = 2, c = 5
//输出：[1, 2]
//解释：将石子从 5 移动到 4 再移动到 3，或者我们可以直接将石子移动到 3。
// 
//
// 示例 2： 
//
// 输入：a = 4, b = 3, c = 2
//输出：[0, 0]
//解释：我们无法进行任何移动。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= a <= 100 
// 1 <= b <= 100 
// 1 <= c <= 100 
// a != b, b != c, c != a 
// 
// Related Topics 脑筋急转弯 
// 👍 26 👎 0

package me.leergo.leetcode.question.easy;

import java.util.Arrays;

public class MovingStonesUntilConsecutive_1033 {
    public static void main(String[] args) {
        Solution solution = new MovingStonesUntilConsecutive_1033().new Solution();
        System.out.println(Arrays.toString(solution.numMovesStones(1, 2, 3)));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    
    
    /**
     * 思路：
     *  1、把这三个数字排序
     *  2、找到最大的次数
     *      max = 最大数 - 最小数 - 2
     *
     *  3、找到最小的次数
     *      3-1:如果三个数是连续的 1 2 3，            最小数 ： 0
     *      3-2:如果有两个数之前的差是1、或者2，      最小数 :  1
     *          eg: 1 55 56   ->   54 55 56
     *              1 3 56    ->   1 2 3
     *      3-3: 其它的                                最小数 : 2
     *          eg:  1  23 55  ->    22 23 24
     */
    class Solution {
        public int[] numMovesStones(int a, int b, int c) {
            int[] arr = new int[]{a, b, c};
            int[] res = new int[2];
            Arrays.sort(arr);
            
            res[1] = arr[2] - arr[0] - 2;
            
            if (arr[2] - arr[1] == 1 && arr[1] - arr[0] == 1) res[0] = 0;
            else if (arr[2] - arr[1] == 1 || arr[1] - arr[0] == 1 || arr[2] - arr[1] == 2 || arr[1] - arr[0] == 2) res[0] = 1;
            else res[0] = 2;
            
            return res;
            
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}