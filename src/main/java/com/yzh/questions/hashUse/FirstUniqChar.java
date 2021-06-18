package com.yzh.questions.hashUse;


import java.util.HashMap;
import java.util.Map;

/**
 * 387. 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class FirstUniqChar {

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // 第一遍存数量
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        // 第二遍找出对应的index
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)).equals(1)) {
                return i;
            }
        }
        return -1;
    }
}
