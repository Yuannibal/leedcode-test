package com.yzh.questions.stringUse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 6. Z 字形变换
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 */
public class ConvertTest {

    @Test
    public void test_1() {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        Assert.assertEquals("PAHNAPLSIIGYIR", new Convert().convert(s, numRows));
    }

    @Test
    public void test_2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;

        Assert.assertEquals("PINALSIGYAHRPI", new Convert().convert(s, numRows));
    }

    @Test
    public void test_3() {
        String s = "A";
        int numRows = 1;

        Assert.assertEquals("A", new Convert().convert(s, numRows));
    }
}