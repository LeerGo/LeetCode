package me.leergo._760;

import java.util.Arrays;

public class FindAnagramMappings {
    public static void main(String[] args) {
        int[] a = {12, 28, 46, 32, 50};
        int[] b = {50, 12, 32, 46, 28};

        // expect res : [1,4,3,2,0]
        int[] res = new Solution().anagramMappings(a, b);
        System.out.println(Arrays.toString(res));
    }
}
