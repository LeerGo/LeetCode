package me.leergo.easy._771;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        Set set = new HashSet();

        for (char c : J.toCharArray()) {
            set.add(c);
        }

        for (char c : S.toCharArray()) {
            if (set.contains(c)) {
                res++;
            }
        }

        return res;
    }

//    public int numJewelsInStones(String J, String S) {
//        int                     res = 0;
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < S.toCharArray().length; i++) {
//            Character key = S.charAt(i);
//
//            if (map.keySet().contains(key)) {
//                map.put(key, map.get(key) + 1);
//            } else {
//                map.put(key, 1);
//            }
//        }
//
//        for (char j : J.toCharArray()) {
//            if (map.keySet().contains(j)) {
//                res += map.get(j);
//            }
//        }
//
//        return res;
//    }
}