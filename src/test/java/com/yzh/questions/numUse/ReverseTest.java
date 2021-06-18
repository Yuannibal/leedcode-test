package com.yzh.questions.numUse;


import org.junit.Assert;
import org.junit.Test;

/**
 * 7. 整数反转
 *
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围 ，就返回 0。
 */
public class ReverseTest {

    @Test
    public void test_1() {
        int x = 123;
        Assert.assertEquals(321, new Reverse().reverse(x));
    }

    @Test
    public void test_2() {
        int x = -123;
        Assert.assertEquals(-321, new Reverse().reverse(x));
    }

    @Test
    public void test_3() {
        int x = 120;
        Assert.assertEquals(21, new Reverse().reverse(x));
    }

    @Test
    public void test_4() {
        int x = 0;
        Assert.assertEquals(0, new Reverse().reverse(x));
    }

    @Test
    public void test_5() {  // 超出范围
        int x = 1534236469;
        Assert.assertEquals(0, new Reverse().reverse(x));
    }

    @Test
    public void test_6() {  // 超出范围
        int x = -2147483412;
        Assert.assertEquals(-2143847412, new Reverse().reverse(x));
    }
}