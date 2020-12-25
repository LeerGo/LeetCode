package me.leergo;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1, 2, 3}, 101));
    }
    
    static int coinChange(int[] coins, int amount) {
        int flag = amount + 1;
        int[] mem = new int[flag];
        Arrays.fill(mem, 1, flag, flag);
        
        for (int i = 0; i < mem.length; i++) {
            for (int c : coins) {
                if (i - c < 0) continue;
                mem[i] = Math.min(mem[i - c] + 1, mem[i]);
            }
        }
        
        if (mem[amount] == flag)
            return -1;
        return mem[amount];
    }
}
