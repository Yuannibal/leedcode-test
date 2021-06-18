package com.yzh.questions.bitCalculate;


import org.junit.Assert;
import org.junit.Test;

/**
 * 231. 2 的幂
 * 给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
 */
public class IsPowerOfTwoTest {

    @Test
    public void test_1() {
        int n = 1;
        Assert.assertTrue((new IsPowerOfTwo()).isPowerOfTwo1(n));
        Assert.assertTrue((new IsPowerOfTwo()).isPowerOfTwo2(n));
    }

    @Test
    public void test_2() {
        int n = 16;
        Assert.assertTrue((new IsPowerOfTwo()).isPowerOfTwo1(n));
        Assert.assertTrue((new IsPowerOfTwo()).isPowerOfTwo2(n));
    }

    @Test
    public void test_3() {
        int n = 3;
        Assert.assertFalse((new IsPowerOfTwo()).isPowerOfTwo1(n));
        Assert.assertFalse((new IsPowerOfTwo()).isPowerOfTwo2(n));
    }

    @Test
    public void test_4() {
        int n = 4;
        Assert.assertTrue((new IsPowerOfTwo()).isPowerOfTwo1(n));
        Assert.assertTrue((new IsPowerOfTwo()).isPowerOfTwo2(n));
    }

    @Test
    public void test_5() {
        int n = 5;
        Assert.assertFalse((new IsPowerOfTwo()).isPowerOfTwo1(n));
        Assert.assertFalse((new IsPowerOfTwo()).isPowerOfTwo2(n));
    }

    @Test
    public void test_6() {
        int n = 0;
        Assert.assertFalse((new IsPowerOfTwo()).isPowerOfTwo1(n));
        Assert.assertFalse((new IsPowerOfTwo()).isPowerOfTwo2(n));
    }

    @Test
    public void test_7() {
        int n = -2;
        Assert.assertFalse((new IsPowerOfTwo()).isPowerOfTwo1(n));
        Assert.assertFalse((new IsPowerOfTwo()).isPowerOfTwo2(n));
    }
}