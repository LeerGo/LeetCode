package me.leergo.easy._760;

import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < B.length; i++) {
            indexMap.put(B[i], i);
        }

        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            res[i] = indexMap.get(A[i]);
        }
        return res;
    }
}