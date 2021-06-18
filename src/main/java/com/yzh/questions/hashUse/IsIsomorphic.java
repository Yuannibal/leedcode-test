package com.yzh.questions.hashUse;

import java.util.HashMap;
import java.util.Map;

/**
 * 205. 同构字符串
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 * 如果 s 中的字符可以按某种映射关系替换得到 t ，那么这两个字符串是同构的。
 *
 * 每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。
 * 不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。
 */
public class IsIsomorphic {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // 两边都要对齐
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        int index = 0;
        while (index < s.length()) {
            if ((map1.containsKey(s.charAt(index)) && !map1.get(s.charAt(index)).equals(t.charAt(index)))
                    || (map2.containsKey(t.charAt(index)) && !map2.get(t.charAt(index)).equals(s.charAt(index)))) {
                return false;
            }

            map1.put(s.charAt(index), t.charAt(index));
            map2.put(t.charAt(index), s.charAt(index));
            index++;
        }
        return true;
    }
}
