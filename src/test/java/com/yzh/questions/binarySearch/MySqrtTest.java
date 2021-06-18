package com.yzh.questions.binarySearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * 69. x 的平方根
 * 实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 */
public class MySqrtTest {

    @Test
    public void test_1() {
        int x = 4;
        Assert.assertEquals(2, (new MySqrt()).mySqrt(x));
    }

    @Test
    public void test_2() {
        int x = 8;
        Assert.assertEquals(2, (new MySqrt()).mySqrt(x));
    }

    @Test
    public void test_3() {
        int x = 1;
        Assert.assertEquals(1, (new MySqrt()).mySqrt(x));
    }

    @Test
    public void test_4() {  // 小心越界
        int x = 2147395599;
        Assert.assertEquals(46339, (new MySqrt()).mySqrt(x));
    }
}