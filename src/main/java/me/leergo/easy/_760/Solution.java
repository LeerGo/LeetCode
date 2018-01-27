package me.leergo.easy._760;

class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            res[i] = getIndex(B, A[i]);
        }
        return res;
    }

    private int getIndex(int[] b, int i) {
        for (int j = 0; j < b.length; j++) {
            if (b[j] == i) {
                return j;
            }
        }
        return -1;
    }
}