package me.leergo._500;

import java.util.Arrays;

/**
 * Created by Xoder on 2017/7/5.
 */
public class KeyboardRow {
    public static void main(String[] args) {
        String[] strs = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(new Solution().findWords(strs)));
    }
}
