package me.leergo.easy._657;

class Solution2 {
    public boolean judgeCircle(String moves) {
        int[] res = new int[128];

        char[] array = moves.toCharArray();
        for (char tem : array) {
            res[tem]++;
        }

        return res['U'] == res['D'] && res['L'] == res['R'];
    }
}