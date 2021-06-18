package com.yzh.questions.bitCalculate;

import org.junit.Assert;
import org.junit.Test;

/**
 * 190. 颠倒二进制位
 * 颠倒给定的 32 位无符号整数的二进制位。
 */
public class ReverseBitsTest {

    @Test
    public void test_1() {
        int n = 0b00000010100101000001111010011100;
        Assert.assertEquals(0b00111001011110000010100101000000, new ReverseBits().reverseBits(n));
    }

    @Test
    public void test_2() {
        int n = 0b11111111111111111111111111111101;
        Assert.assertEquals(0b10111111111111111111111111111111, new ReverseBits().reverseBits(n));
    }
}