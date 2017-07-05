package me.leergo._535;

/**
 * Created by Xoder on 2017/7/5.
 */
public class TinyUrl {
    public static void main(String[] args) {
        Codec  codec    = new Codec();
        String longUrl  = "https://leetcode.com/problems/design-tinyurl";
        String shortUrl = codec.encode(longUrl);

        System.out.println(shortUrl);
        System.out.println(codec.decode(shortUrl));


    }
}
