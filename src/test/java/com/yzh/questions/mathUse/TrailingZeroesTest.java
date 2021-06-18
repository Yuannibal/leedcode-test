package com.yzh.questions.mathUse;


import org.junit.Assert;
import org.junit.Test;

/**
 * 172. 阶乘后的零
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。
 */
public class TrailingZeroesTest {

    @Test
    public void test_1() {
        int n = 3;
        Assert.assertEquals(0, new TrailingZeroes().trailingZeroes1(n));
    }

    @Test
    public void test_2() {
        int n = 5;
        Assert.assertEquals(1, new TrailingZeroes().trailingZeroes1(n));
    }

    @Test
    public void test_3() {
        int n = 30;
        Assert.assertEquals(7, new TrailingZeroes().trailingZeroes1(n));
    }
}