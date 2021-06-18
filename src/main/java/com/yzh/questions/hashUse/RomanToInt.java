package com.yzh.questions.hashUse;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. 罗马数字转整数
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 */
public class RomanToInt {

    /**
     * 方法一: 全模拟
     */
    private static final Map<String, Integer> map1 = new HashMap<String, Integer>(13) {
        {
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);

            put("IV", 4);
            put("IX", 9);
            put("XL", 40);
            put("XC", 90);
            put("CD", 400);
            put("CM", 900);
        }
    };
    public int romanToInt1(String s) {
        int result = 0;
        int index = 0;
        while (index < s.length()) {
            if (index + 1 < s.length() && map1.containsKey(s.substring(index, index + 2))) {
                result = result + map1.get(s.substring(index, index + 2));
                index = index + 2;
            } else {
                result = result + map1.get(s.substring(index, index + 1));
                index = index + 1;
            }
        }
        return result;
    }

    /**
     * 方法二: 半模拟
     * 通常情况下，罗马数字中小的数字在大的数字的右边
     * 若输入的字符串满足该情况，那么可以将每个字符视作一个单独的值，累加每个字符对应的数值即可。
     *
     * 若存在小的数字在大的数字的左边的情况，根据规则需要减去小的数字。
     * 对于这种情况，我们也可以将每个字符视作一个单独的值，若一个数字右侧的数字比它大，则将该数字的符号取反。
     */
    private static final Map<Character, Integer> map2 = new HashMap<Character, Integer>(7) {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };
    public int romanToInt2(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = map2.get(s.charAt(i));

            if (i + 1 < s.length() && value < map2.get(s.charAt(i + 1))) {
                result = result - value;
            } else {
                result = result + value;
            }
        }
        return result;
    }
}
