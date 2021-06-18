package com.yzh.questions.bitCalculate;

import org.junit.Assert;
import org.junit.Test;

/**
 * 342. 4的幂
 * 给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 true ；否则，返回 false 。
 */
public class IsPowerOfFourTest {

    @Test
    public void test_1() {
        int n = 16;
        Assert.assertTrue(new IsPowerOfFour().isPowerOfFour1(n));
        Assert.assertTrue(new IsPowerOfFour().isPowerOfFour21(n));
        Assert.assertTrue(new IsPowerOfFour().isPowerOfFour22(n));
    }

    @Test
    public void test_2() {
        int n = 5;
        Assert.assertFalse(new IsPowerOfFour().isPowerOfFour1(n));
        Assert.assertFalse(new IsPowerOfFour().isPowerOfFour21(n));
        Assert.assertFalse(new IsPowerOfFour().isPowerOfFour22(n));
    }

    @Test
    public void test_3() {
        int n = 1;
        Assert.assertTrue(new IsPowerOfFour().isPowerOfFour1(n));
        Assert.assertTrue(new IsPowerOfFour().isPowerOfFour21(n));
        Assert.assertTrue(new IsPowerOfFour().isPowerOfFour22(n));
    }

    @Test
    public void test_4() {
        int n = 1;
        Assert.assertTrue(new IsPowerOfFour().isPowerOfFour1(n));
        Assert.assertTrue(new IsPowerOfFour().isPowerOfFour21(n));
        Assert.assertTrue(new IsPowerOfFour().isPowerOfFour22(n));
    }

    @Test
    public void test_5() {
        int n = -1;
        Assert.assertFalse(new IsPowerOfFour().isPowerOfFour1(n));
        Assert.assertFalse(new IsPowerOfFour().isPowerOfFour21(n));
        Assert.assertFalse(new IsPowerOfFour().isPowerOfFour22(n));
    }
}