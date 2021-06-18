package com.yzh.questions.bitCalculate;

import org.junit.Assert;
import org.junit.Test;

/**
 * 191. 位1的个数
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 */
public class HammingWeightTest {

    @Test
    public void test_1() {
        int n = 0b00000000000000000000000000001011;
        Assert.assertEquals(3, new HammingWeight().hammingWeight1(n));
        Assert.assertEquals(3, new HammingWeight().hammingWeight2(n));
    }

    @Test
    public void test_2() {
        int n = 0b00000000000000000000000010000000;
        Assert.assertEquals(1, new HammingWeight().hammingWeight1(n));
        Assert.assertEquals(1, new HammingWeight().hammingWeight2(n));
    }

    @Test
    public void test_3() {
        int n = 0b11111111111111111111111111111101;
        Assert.assertEquals(31, new HammingWeight().hammingWeight1(n));
        Assert.assertEquals(31, new HammingWeight().hammingWeight2(n));
    }
}