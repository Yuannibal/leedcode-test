package com.yzh.stack;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 20.有效的括号
 * 给定一个只包括 '(',')','{','}','[',']' 的字符串s,判断字符串内括号是否有效
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Solution20.class})
public class Solution20Test {

    @InjectMocks
    private Solution20 solution;

    @Test
    public void test1() {
        String s = "()";
        boolean result = solution.isValid(s);
        Assert.assertTrue(result);
    }

    @Test
    public void test2() {
        String s = "()[]{}";
        boolean result = solution.isValid(s);
        Assert.assertTrue(result);
    }

    @Test
    public void test3() {
        String s = "(]";
        boolean result = solution.isValid(s);
        Assert.assertFalse(result);
    }

    @Test
    public void test4() {
        String s = "([])";
        boolean result = solution.isValid(s);
        Assert.assertTrue(result);
    }

    @Test
    public void test5() {
        String s = "([)]";
        boolean result = solution.isValid(s);
        Assert.assertFalse(result);
    }
}
