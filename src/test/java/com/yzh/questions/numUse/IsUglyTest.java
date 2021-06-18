package com.yzh.questions.numUse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 263. 丑数
 *
 * 给你一个整数 n ，请你判断 n 是否为 丑数 。如果是，返回 true ；否则，返回 false 。
 * 丑数 就是只包含质因数 2、3 和/或 5 的正整数。
 */
public class IsUglyTest {

    @Test
    public void test_1() {
        int n = 6;
        Assert.assertTrue(new IsUgly().isUgly(n));
    }

    @Test
    public void test_2() {
        int n = 8;
        Assert.assertTrue(new IsUgly().isUgly(n));
    }

    @Test
    public void test_3() {
        int n = 14;
        Assert.assertFalse(new IsUgly().isUgly(n));
    }

    @Test
    public void test_4() {
        int n = 1;
        Assert.assertTrue(new IsUgly().isUgly(n));
    }
}