package com.yzh.questions.stringUse;

/**
 * 28. 实现 strStr()
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 */
public class StrStr {

    public int strStr1(String haystack, String needle) {
        if ("".equals(haystack) && "".equals(needle)) {
            return 0;
        }

        int haystack_index = 0;
        int needle_index = 0;

        while (haystack_index < haystack.length()) {
            while (haystack_index + needle_index < haystack.length()
                    && needle_index < needle.length()
                    && haystack.charAt(haystack_index + needle_index) == needle.charAt(needle_index)) {
                needle_index++;
            }

            if (needle_index == needle.length()) {
                return haystack_index;
            } else {
                needle_index = 0;
                haystack_index++;
            }
        }
        return -1;
    }
}
