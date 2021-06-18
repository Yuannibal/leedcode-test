package com.yzh.questions.stringUse;


import org.junit.Assert;
import org.junit.Test;

/**
 * 67. 二进制求和
 * 给你两个二进制字符串，返回它们的和（用二进制表示）
 * 输入为 非空 字符串且只包含数字 1 和 0
 */
public class AddBinaryTest {

    @Test
    public void test_1() {
        String a = "11";
        String b = "1";
        Assert.assertEquals("100", (new AddBinary()).addBinary(a, b));
    }

    @Test
    public void test_2() {
        String a = "1010";
        String b = "1011";
        Assert.assertEquals("10101", (new AddBinary()).addBinary(a, b));
    }

    @Test
    public void test_3() {
        String a = "0";
        String b = "0";
        Assert.assertEquals("0", (new AddBinary()).addBinary(a, b));
    }
}