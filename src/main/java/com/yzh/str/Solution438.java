package com.yzh.str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 438.找到字符串中所有字母异位词
 * 给定两个字符串 s 和 p, 找到 s 中所有 p 的 异位词 的子串,返回这些子串的起始索引
 */
public class Solution438 {

    /**
     * 排序 + 字符串比较
     *
     * @param s 输入字符串
     * @param p 异位词字符串
     * @result 匹配下标列表
     */
    public List<Integer> findAnagrams(String s, String p) {
        char[] pChars = p.toCharArray();
        Arrays.sort(pChars);
        String pStr = new String(pChars);

        List<Integer> result = new ArrayList<>();
        int pLen = p.length();
        for (int i = 0; i <= s.length() - pLen; i++) {
            char[] chars = s.substring(i, i + pLen).toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            if (str.equals(pStr)) {
                result.add(i);
            }
        }
        return result;
    }
}
