package me.leergo.leetcode.question.easy._500;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * <h1>500. Keyboard Row</h1>
 *
 * <b>create time : </b>2017-07-05 16:48:18<br>
 * <b>create by</b> : LeerGo!
 *
 * <p>
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's
 * of American keyboard like the image below.
 * </p>
 */
public class Solution {

    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();

        for (String word : words) {
            if (isOneRow(word)) {
                res.add(word);
            }
        }
        String[] data = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            data[i] = res.get(i);
        }
        return data;
    }

    private boolean isOneRow(String word) {
        String rule = "[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*";
        Pattern pattern = Pattern.compile(rule);
        return pattern.matcher(word.toLowerCase()).matches();
    }
}