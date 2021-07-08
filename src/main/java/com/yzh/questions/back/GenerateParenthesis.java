package com.yzh.questions.back;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 */
public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesis(n, result, new StringBuilder(), 0, 0);
        return result;
    }

    private void generateParenthesis(int n, List<String> result, StringBuilder stringBuilder, int left, int right) {
        if (stringBuilder.length() == 2 * n) {
            result.add(stringBuilder.toString());
            return;
        }

        // 左括号
        if (left < n) {
            stringBuilder.append("(");
            generateParenthesis(n, result, stringBuilder, left + 1, right);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }

        // 右括号
        if (right < left) {
            stringBuilder.append(")");
            generateParenthesis(n, result, stringBuilder, left, right + 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
