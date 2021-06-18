package com.yzh.questions.bitCalculate;

import org.junit.Assert;
import org.junit.Test;

/**
 * 461. 汉明距离
 * 两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
 * 给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
 */
public class HammingDistanceTest {

    @Test
    public void test_1() {
        int x = 1;
        int y = 4;
        Assert.assertEquals(2, (new HammingDistance()).hammingDistance1(x, y));
        Assert.assertEquals(2, (new HammingDistance()).hammingDistance21(x, y));
        Assert.assertEquals(2, (new HammingDistance()).hammingDistance22(x, y));
        Assert.assertEquals(2, (new HammingDistance()).hammingDistance3(x, y));
    }

    @Test
    public void test_2() {
        int x = 3;
        int y = 1;
        Assert.assertEquals(1, (new HammingDistance()).hammingDistance1(x, y));
        Assert.assertEquals(1, (new HammingDistance()).hammingDistance21(x, y));
        Assert.assertEquals(1, (new HammingDistance()).hammingDistance22(x, y));
        Assert.assertEquals(1, (new HammingDistance()).hammingDistance3(x, y));
    }
}