package com.yzh.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20.有效的括号
 * 给定一个只包括 '(',')','{','}','[',']' 的字符串s,判断字符串内括号是否有效
 */
public class Solution20 {

    private static final Map<Character, Character> map = new HashMap<>(3);
    static {
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.pop() != map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
