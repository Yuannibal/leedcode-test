package com.yzh.questions.hashUse;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 242. 有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 */
public class IsAnagram {

    /**
     * 方法一:：哈希表
     */
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        // 遍历第一个字符串
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        // 遍历第二个字符串
        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.charAt(i))) {
                return false;
            } else {
                if (Objects.equals(map.put(t.charAt(i), map.get(t.charAt(i)) - 1), 0)) {  //Map.put() 返回原来value
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * 方法二: 排序 + 数组equals
     */
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // 字符串转字符数组
        char[] char_s = s.toCharArray();
        char[] char_t = t.toCharArray();

        // 排序
        Arrays.sort(char_s);
        Arrays.sort(char_t);

        // 数组值比较
        return Arrays.equals(char_s, char_t);
    }
}
