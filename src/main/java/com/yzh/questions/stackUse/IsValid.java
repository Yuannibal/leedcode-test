package com.yzh.questions.stackUse;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 * 1.左括号必须用相同类型的右括号闭合。
 * 2.左括号必须以正确的顺序闭合。
 */
public class IsValid {

    private static final Map<Character, Character> map = new HashMap<Character, Character>(3) {
        {
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }
    };

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    stack.add(s.charAt(i));
                    break;
                case ')':
                case '}':
                case ']':
                    if (!stack.isEmpty() && map.get(s.charAt(i)) == stack.pop()) {
                        break;
                    } else {
                        return false;
                    }
                default:
                    break;
            }
        }

        return stack.isEmpty();
    }
}
