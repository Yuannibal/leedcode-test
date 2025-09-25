package com.yzh.back;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 17.电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串,返回所有它能表示的字母组合。答案可以按 任意顺序 返回
 */
public class Solution17 {

    private static final Map<Character, List<String>> map = new HashMap<>(8);

    static {
        map.put('2', Arrays.asList("a", "b", "c"));
        map.put('3', Arrays.asList("d", "e", "f"));
        map.put('4', Arrays.asList("g", "h", "i"));
        map.put('5', Arrays.asList("j", "k", "l"));
        map.put('6', Arrays.asList("m", "n", "o"));
        map.put('7', Arrays.asList("p", "q", "r", "s"));
        map.put('8', Arrays.asList("t", "u", "v"));
        map.put('9', Arrays.asList("w", "x", "y", "z"));
    }

    /**
     * 回溯
     *
     * @param digits 电话号码
     * @return 字母组合
     */
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) {
            return result;
        }
        back(0, digits, "", result);
        return result;
    }

    /**
     * 回溯逻辑
     * 说明:下标 + 集合 递归代替循环
     *
     * @param i 电话号码下标
     * @param digits 电话号码
     * @param prefix 字母前缀
     * @param result 字母组合列表(结果集合)
     */
    private void back(int i, String digits, String prefix, List<String> result) {
        char digit = digits.charAt(i);
        List<String> chars = map.get(digit);
        for (String c : chars) {
            String str = prefix + c;
            if (i == digits.length() - 1) {
                result.add(str);
            } else {
                back(i + 1, digits, str, result);
            }
        }
    }
}
