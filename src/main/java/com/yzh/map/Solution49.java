package com.yzh.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 49.字母异位词分组
 * 给你一个字符串数组,请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 */
public class Solution49 {

    /**
     * 排序 + Map
     * 技巧: 异位如何统一,排序后就统一了;排序后的字符串为key
     *
     * @param strs 输入字符串
     * @result 字母异位词分组
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
