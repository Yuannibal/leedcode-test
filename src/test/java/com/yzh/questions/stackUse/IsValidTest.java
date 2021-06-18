package com.yzh.questions.stackUse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 * 1.左括号必须用相同类型的右括号闭合。
 * 2.左括号必须以正确的顺序闭合。
 */
public class IsValidTest {

    @Test
    public void test_1() {
        String s = "()";
        Assert.assertTrue(new IsValid().isValid(s));
    }

    @Test
    public void test_2() {
        String s = "()[]{}";
        Assert.assertTrue(new IsValid().isValid(s));
    }

    @Test
    public void test_3() {
        String s = "(]";
        Assert.assertFalse(new IsValid().isValid(s));
    }

    @Test
    public void test_4() {
        String s = "(";
        Assert.assertFalse(new IsValid().isValid(s));
    }

    @Test
    public void test_5() {
        String s = ")";
        Assert.assertFalse(new IsValid().isValid(s));
    }
}