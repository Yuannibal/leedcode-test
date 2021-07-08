package com.yzh.questions.back;

import java.util.List;
import org.junit.Test;

/**
 * 22. 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 */
public class GenerateParenthesisTest {

    @Test
    public void test_1() {
        int n = 1;

        List<String> result = new GenerateParenthesis().generateParenthesis(n);
        result.forEach(System.out::println);
        System.out.println();
    }

    @Test
    public void test_2() {
        int n = 3;

        List<String> result = new GenerateParenthesis().generateParenthesis(n);
        result.forEach(System.out::println);
        System.out.println();
    }
}