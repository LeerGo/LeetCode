//322 - 零钱兑换	 

//给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回
// -1。 
//
// 你可以认为每种硬币的数量是无限的。 
//
// 
//
// 示例 1： 
//
// 
//输入：coins = [1, 2, 5], amount = 11
//输出：3 
//解释：11 = 5 + 5 + 1 
//
// 示例 2： 
//
// 
//输入：coins = [2], amount = 3
//输出：-1 
//
// 示例 3： 
//
// 
//输入：coins = [1], amount = 0
//输出：0
// 
//
// 示例 4： 
//
// 
//输入：coins = [1], amount = 1
//输出：1
// 
//
// 示例 5： 
//
// 
//输入：coins = [1], amount = 2
//输出：2
// 
//
// 
//
// 提示： 
//
// 
// 1 <= coins.length <= 12 
// 1 <= coins[i] <= 231 - 1 
// 0 <= amount <= 104 
// 
// Related Topics 动态规划 
// 👍 986 👎 0

package me.leergo.leetcode.question.classic;

import java.util.Arrays;

public class CoinChange_322 {
    public static void main(String[] args) {
        Solution solution = new CoinChange_322().new Solution();
        System.out.println(solution.coinChange(new int[]{/*1,*/ 2, 3}, 101));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int coinChange(int[] coins, int amount) {
            int flag = amount + 1;
            int[] record = new int[flag];
            // base record[0] = 0
            // index = 钱数
            // record[index] = 最小钱币数
            Arrays.fill(record, 1, flag, flag);
            
            
            for (int i = 0; i < record.length; i++) {
                for (int coin : coins) {
                    if (i - coin < 0) continue;
                    record[i] = Math.min(record[i], 1 + record[i - coin]);
                }
            }
            
            if ((record[amount] == amount + 1)) return -1;
            else return record[amount];
        }
        // 打表，记录对应届
        /*HashMap<Integer, Integer> mem = new HashMap<>();

        public int coinChange(int[] coins, int amount) {
            if (mem.containsKey(amount)) return mem.get(amount);
            if (amount < 0) return -1;
            if (amount == 0) return 0;

            int res = Integer.MAX_VALUE;

            for (int coin : coins) {
                int sub = coinChange(coins, amount - coin);
                if (sub == -1) continue;
                res = Math.min(res, sub + 1);
            }

            if (res != Integer.MAX_VALUE) mem.put(amount, res);
            else mem.put(amount, -1);
            return mem.get(amount);
        }*/
        
        // 暴力解法
        /*public int coinChange(int[] coins, int amount) {
            if (amount < 0) return -1;
            if (amount == 0) return 0;
            
            int res = Integer.MAX_VALUE;
            
            for (int coin : coins) {
                int sub = coinChange(coins, amount - coin);
                if (sub == -1) continue;
                res = Math.min(res, sub + 1);
            }
            
            
            if (res != Integer.MAX_VALUE) return res;
            else return -1;
        }*/
    }
    //leetcode submit region end(Prohibit modification and deletion)
}