package me.leergo.leetcode.question.easy._728;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isValid(i)) {
                res.add(i);
            }
        }
        return res;
    }

    private boolean isValid(int num) {
        int tem = num;
        if (num < 10) {
            return true;
        }

        while (num != 0) {
            int c = num % 10;
            if (c == 0 || tem % c != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}