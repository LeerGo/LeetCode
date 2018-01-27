package me.leergo.easy._535;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>535. Encode and Decode TinyURL</h1>
 *
 * <b>create time : </b>2017-07-05 14:35:05<br>
 * <b>create by</b> : LeerGo!
 *
 * <p>
 * TinyURL is a URL shortening service where you enter a URL such as <b>https://leetcode.com/problems/design-tinyurl</b> and
 * it returns a short URL such as <b>http://tinyurl.com/4e9iAk</b>.
 * Design the encode and decode methods for the TinyURL service.
 * There is no restriction on how your encode/decode algorithm should work.
 * You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
 * </p>
 */
public class Codec {
    /*
        key point:
        1. 不关心具体算法实现
        2. 实际上就是长短对应的关系
     */

    private List<String> urls = new ArrayList<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        urls.add(longUrl);
        return String.valueOf(urls.indexOf(longUrl));
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int index = Integer.parseInt(shortUrl);
        return index<urls.size()?urls.get(index):"";
    }
}
