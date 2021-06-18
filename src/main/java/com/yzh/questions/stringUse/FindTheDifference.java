package com.yzh.questions.stringUse;

/**
 * 389. 找不同
 * 给定两个字符串 s 和 t，它们只包含小写字母
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母
 * 请找出在 t 中被添加的字母
 */
public class FindTheDifference {

    /**
     * 方法一：求和
     */
    public char findTheDifference(String s, String t) {
        int result = 0;

        for (int i = 0; i < t.length(); i++) {
            result = result + t.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            result = result - s.charAt(i);
        }

        return (char) result;
    }
}
