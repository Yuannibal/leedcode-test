package com.yzh.str;

/**
 * 28.找出字符串中第一个匹配项的下标
 * 给你两个字符串 haystack 和 needle，
 * 在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标;如果 needle 不是 haystack 的一部分,返回  -1
 */
public class Solution28 {

    /**
     * 双指针
     *
     * @param haystack 数组
     * @param needle 值
     * @result 第一个匹配项的下标
     */
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
}
